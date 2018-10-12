package tickets.select;

import java.util.List;

/* *
 * made by xwt
 * in 2018.7.26
 * */

public class TrainMessage {
	
	private List<String> result;  // 只留下想要的数据，车次和票数
	private String flag;
	private MapMessage map;     // 出发站和到达站的英文代码
	
	public void setResult(List<String> result){
		this.result = result;
	}
	public List<String> getResult(){
		return result;
	}
	
	public void setFlag(String flag){
		this.flag = flag;
	}
	public String getFlag(){
		return flag;
	}
	
	public void setMap(MapMessage map){
		this.map = map;
	}
	public MapMessage getMap(){
		return map;
	}

}
