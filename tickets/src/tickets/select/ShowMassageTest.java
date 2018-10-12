package tickets.select;

/* *
 * made by xwt
 * in 2018.7.26
 * */

import java.io.IOException;
import java.util.ArrayList;

public class ShowMassageTest {
	public static void main(String []args) throws IOException{
		
		// 制作url
		String date = "2018-08-03";  // yyy-MM-dd格式
		String departStation = "北京";   // 出发地
		String destination = "沧州";    //目的地
		String personType = "成人";   // 乘客类型
				
//		// 获取json数据，转化成string

		ArrayList<FinalTrainResult> resultList = new ArrayList<>();
		//存储并打印结果
		ShowMessage showMessage  = new ShowMessage();
		resultList = ShowMessage.saveAndPrint(date, departStation, destination, personType);	
		System.out.println("共"+ resultList.size() + "个车次");
			
	}

	

}
