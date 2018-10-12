package tickets.select;

/*
 * made by xwt
 * in 2018.7.26
 * */

public class MapMessage {
	//"AOH":"上海虹桥","BJP":"北京","SHH":"上海","VNP":"北京南"
	private String AOH ; //fromStationName;
	private String fromStationCode;
	private String BJP; //toStationName;
	private String toStationCode;
	private String SHH;  //startStationName;
	private String startStationCode;
	private String VNP; //endStationName;
	// private String endStationCode;
	
	public void setFromName(String fromStationName){
		this.VNP = fromStationName;
	}
	public String getFromName(){
		return VNP;
	}
	
	public void setFromCode(String fromStationCode){
		this.fromStationCode = fromStationCode;
	}
	public String getFromCode(){
		return fromStationCode;
	}
	
	public void setToName(String toStationName){
		this.AOH = toStationName;
	}
	public String getToName(){
		return AOH;
	}
	
	public void setToCode(String toStationCode){
		this.toStationCode = toStationCode;
	}
	public String getToCode(){
		return toStationCode;
	}
	
	public void setStartName(String startStationName){
		this.BJP = startStationName;
	}
	public String getStartName(){
		return BJP;
	}
	
	public void setStartCode(String startStationCode){
		this.startStationCode = startStationCode;
	}
	public String getStartCode(){
		return startStationCode;
	}
	
	public void setEndName(String endStationName){
		this.SHH = endStationName;
	}
	public String getEndName(){
		return SHH;
	}

}
