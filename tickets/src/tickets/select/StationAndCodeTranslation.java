package tickets.select;

/*
 * made by xwt
 * in 2018.7.26
 * */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class StationAndCodeTranslation {
	
	/* *
	 * 读取excl文件，将其存入map类中
	 */
	
	public HashMap<String , String> ReadExcl() throws IOException{
		
		//定义map，以备后续存入
		HashMap<String, String> translationMap = new HashMap<String ,String>(16); // 初始化时指定大小，16为默认值
		//使用apache poi读取.xlsx文件
		String path = "train_station_code.xlsx";
		FileInputStream fileInputStream = new FileInputStream(path);
		// 构造 XSSFWorkbook 对象，path 传入文件路径 
		XSSFWorkbook xwb = new XSSFWorkbook(fileInputStream);
		//读取第一章表格内容
		XSSFSheet sheet = xwb.getSheetAt(0);
		//System.out.println(sheet.toString());
		//定义row，按行读出想要的单元格
		XSSFRow row;
		String cellName;
		String cellCode;
		for (int i = sheet.getFirstRowNum()+1; i < sheet.getPhysicalNumberOfRows(); i++) {
			row = sheet.getRow(i);
			//获取指定单元格内容
			cellName = row.getCell(1).getStringCellValue(); // 车站名称
			cellCode = row.getCell(5).getStringCellValue(); // 车站代码
			//System.out.println(cellCode);
			//System.out.println(cellName);
			if (!translationMap.containsKey(cellName)) {
				translationMap.put(cellName, cellCode);  // 存入map
			}
		}
		xwb.close();
		return translationMap;
	}
	
	/* *
	 * 根据汉字车站名查找英文代码
	 */

	public String FindStationCode(String stationName) throws IOException{
		String stationCode = null;
		Map<String, String> map = new HashMap<String ,String >();
		map = ReadExcl(); // 读取excl文件
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (stationName.equals(entry.getKey())) {
				stationCode = entry.getValue(); // 获取英文code
			}
		}
		return stationCode;
		
	}
	
	/* *
	 * 根据英文代码查找中文名
	 */

	public String FindName(String stationCode) throws IOException {
		String stationName = null;
		Map<String, String> map = ReadExcl();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (stationCode.equals(entry.getValue())) {
				stationName = entry.getKey();   // 获取中文名称
			}
		}
		return stationName;
		
	}

}
