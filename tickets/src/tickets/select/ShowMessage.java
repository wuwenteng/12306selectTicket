package tickets.select;

/* *
 * made by xwt
 * in 2018.7.26
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class ShowMessage {
	
	/* *
	 * 请求链接得到json类型的返回数据
	 * @url 请求的网络地址
	 * 返回json类型的字符串
	 * */

	public static String showAllReturnMassage(String dayTime, 
			String startingPlace, String finalPlace, String personType) throws IOException{
		// 请求https链接
		
		// 制作urlStr
		make12306URL makeUrl = new make12306URL();
		String url = makeUrl.makeURL(dayTime, startingPlace, finalPlace, personType);
		// 利用urlStr生成URL
		URL reqURL = new URL(url);
		// 创建https链接
		HttpsURLConnection httpsConn = (HttpsURLConnection) reqURL.openConnection();
		// 读取该链接的输入流，以读取响应内容
		InputStreamReader insreader = new  InputStreamReader(httpsConn.getInputStream());
		
		// 为输入流添加缓冲
		BufferedReader bufferedReader = new BufferedReader(insreader);
		String data = bufferedReader.readLine();
		StringBuilder alldata = new StringBuilder();
		while (data != null){
			// System.out.print(data);
			alldata.append(data);
			data = bufferedReader.readLine();
		}
		String dataMessage = alldata.toString();
		return dataMessage;
	}
	public static List<String> trainsAndTickets(String dayTime, String startingPlace, String finalPalce,
		String personType) throws IOException {
		String ticketsdata;
		ticketsdata = showAllReturnMassage(dayTime, startingPlace, finalPalce, personType).toString();
		// 将string数据转化成java对象
		Gson gson = new Gson();
		if ("".equals(ticketsdata)) {
			System.out.println("数据为空，请检查输入格式或时间");
		}
		ResultJsonToJavaBean trainMessage = gson.fromJson(ticketsdata, ResultJsonToJavaBean.class);
		List<String> trainData1 = trainMessage.getData().getResult();
		//将其存入result对象,形成一个list
		return trainData1;
	}
	
    public static ArrayList<FinalTrainResult> saveAndPrint(String date, String departStation, String destination,
    		String personType) throws IOException {
		
    	StationAndCodeTranslation translation = new StationAndCodeTranslation();
	    List<String> trainData = new ArrayList<>();
	    trainData = trainsAndTickets(date, departStation, destination, personType);
		ArrayList<FinalTrainResult> resultList = new ArrayList<>();
		FinalTrainResult selectResult = null;
		Iterator<String> iterator = trainData.iterator();
		while (iterator.hasNext()) {
			String itemData = iterator.next();
			String[] trainMessageOne = itemData.split("\\|");  // 以|为标志切割字符串，得到字符串组，切得的数组长度相同
			/// 输出切割后的字符串数组，测试用
//			for (String string : trainMessageOne) {
//				System.out.println(string);
//			}
			// 将结果存入对象中，切割后的字符串按固定顺序存储，弄清楚需要的数据的位置将其存起来即可
			// 使用builder
			selectResult = FinalTrainResult.builder()
					.trainCode(trainMessageOne[3])
					.departureStationCode(trainMessageOne[4])
					.destinationStationCode(trainMessageOne[5])
					.fromStationCode(trainMessageOne[6])
					.toStationCode(trainMessageOne[7])
					.startTime(trainMessageOne[8])
					.arriveTime(trainMessageOne[9])
					.lastTime(trainMessageOne[10])
					.canWebBuy(trainMessageOne[11])
					.startTrainDay(trainMessageOne[13])
					.seniorSoftSleeperNum(trainMessageOne[21])
					.softSleeperNum(trainMessageOne[23])
					.softSeatNum(trainMessageOne[24])
					.noSeatNum(trainMessageOne[26])
					.hardSleeperNum(trainMessageOne[28])
					.hardSeatNum(trainMessageOne[29])
					.secondLevelSeatNum(trainMessageOne[30])
					.topLevelSeatNum(trainMessageOne[31])
					.businessSeatNum(trainMessageOne[32])
					.dTrainSleeperNum(trainMessageOne[33])
					.build();
			
			// 打印结果
			System.out.print("车次号："+selectResult.getTrainCode() +"  ");
			// 查找出发地车站中文名字
			String fromStationCode = selectResult.getFromStationCode();
			String fromStationName = translation.FindName(fromStationCode);
			System.out.print("出发站："+fromStationCode+" "+ fromStationName+"  ");
			// 查找目的地车站中文名字
			String toStationCode = selectResult.getToStationCode();
			String toStationName = translation.FindName(toStationCode);
			System.out.print("到达站："+toStationCode+" "+ toStationName+"  ");
			// 查找始发站车站中文名字
			String startStationCode = selectResult.getDepartureStationCode();
			String startStationName = translation.FindName(startStationCode);
			System.out.print("始发站："+startStationCode+" "+ startStationName +"  ");
			// 查找终点站车站的中文名
			String endStationCode = selectResult.getDestinationStationCode();
			String endStationName = translation.FindName(endStationCode);
			System.out.print("终点站："+endStationCode+" "+ endStationName+"  ");
			
			System.out.print("出发时间："+selectResult.getStartTime() +"  ");
			System.out.print("到达时间："+selectResult.getArriveTime() +"  ");
			System.out.print("历时："+selectResult.getLastTime() +"  ");
			System.out.print("可否预定："+selectResult.getCanWebBuy() +"  ");
			System.out.print("发车日："+selectResult.getStartTrainDay() +"  ");
			System.out.print("商务座："+selectResult.getBusinessSeatNum() +"  ");
			System.out.print("一等座："+selectResult.getTopLevelSeatNum() +"  ");
			System.out.print("二等座："+selectResult.getSecondLevelSeatNum() +"  ");
			System.out.print("高级软卧："+selectResult.getSeniorSoftSleeperNum() +"  ");
			System.out.print("软卧："+selectResult.getSoftSleeperNum() +"  ");
			System.out.print("动卧："+selectResult.getDTrainSleeperNum() +"  ");
			System.out.print("硬卧："+selectResult.getHardSleeperNum() +"  ");
			System.out.print("软座：" +selectResult.getSoftSeatNum() +"  ");
			System.out.print("硬座："+selectResult.getHardSeatNum() +"  ");
			System.out.print("无座："+selectResult.getNoSeatNum() + "\n");
			System.out.println("----------------------------------------------------------");
			resultList.add(selectResult);
		}
		return resultList;
	}
}
