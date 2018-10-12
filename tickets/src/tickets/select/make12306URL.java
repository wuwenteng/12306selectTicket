package tickets.select;
/* *
 * made by xwt in 2018-8-1
 */

import java.io.IOException;

public class make12306URL {
	public String makeURL(String dayTime, String startingPlace, String finalPalce, String personType)
			throws IOException {
		//将中文车站名称转化成名称代号
		// 遍历map找出对应的车站代号
		StationAndCodeTranslation translation = new StationAndCodeTranslation();
		String startCode = translation.FindStationCode(startingPlace);
		String finalCode = translation.FindStationCode(finalPalce);
		// System.out.println(startCode);
		//将中文乘客类型转换成英文代号
		String personCode;
		if (personType.equals("成人")) {
			personCode ="ADULT";
		}
		else {
			personCode = "0X00"; //学生
		}
		String firstPart = "https://kyfw.12306.cn/otn/leftTicket/query?";
		String timePart = "leftTicketDTO.train_date="+ dayTime; //跟输入时间有关
		String startPart = "leftTicketDTO.from_station=" +startCode;
		String destination = "leftTicketDTO.to_station="+finalCode;
		String purpose = "purpose_codes="+personCode;
		//最终URL
		String url = firstPart+timePart+"&"+startPart+"&"+destination+"&"+purpose;
		return url;
	}
}
