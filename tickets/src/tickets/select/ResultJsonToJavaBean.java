package tickets.select;

/* *
 * made by xwt
 * in 2018.7.26
 * */

public class ResultJsonToJavaBean {
	
	private TrainMessage data;  // 将获取到的车次信息存入该结构体
	private String httpstatus;
	private String status;
	private String messages;
	
	public void setData(TrainMessage data){
		this.data = data;
	}
	public TrainMessage getData(){
		return data;
	}
	
	public void setHttpsstatus(String httpstatus){
		this.httpstatus = httpstatus;
	}
	public String getHttpsstatus(){
		return httpstatus;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return status;
	}
	
	public void setMessages(String messages){
		this.messages = messages;
	}
	public String getMessages(){
		return messages;
	}

}
