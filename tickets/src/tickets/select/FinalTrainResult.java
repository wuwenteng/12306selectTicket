package tickets.select;

import lombok.Builder;
import lombok.Data;

/*
 * made by xwt
 * in 2018.7.26
 * */

@Data
@Builder
public class FinalTrainResult {
	//建立result包含的所有项
	private String trainCode; //车次号
	private String fromStationName; //出发站
	private String fromStationCode; //出发站码
	private String toStationName; //到达站
	private String toStationCode; //到达站码
	private String departureStationName; //始发站
	private String departureStationCode; //始发站码
	private String destinationStationName; //终点站
	private String destinationStationCode; //终点站码
	private String startTime; //出发时间
	private String arriveTime; //到达时间
	private String lastTime; //历时小时分钟数
	private String dayDifference; //历时天数
	private String canWebBuy; //Y 可以预订、N 不可预订、IS_TIME_NOT_BUY 没到预定时间
	private String startTrainDay; //发车日
	private String dTrainSleeperNum = "-"; //动卧
	private String businessSeatNum = "-";//商务座数
	private String topLevelSeatNum = "-";//一等座数
	private String secondLevelSeatNum = "-";//二等座数
	private String seniorSoftSleeperNum = "-";//高级软卧数
	private String softSleeperNum = "-";//软卧数
	private String hardSleeperNum = "-";//硬卧数
	private String softSeatNum = "-";//软座数
	private String hardSeatNum = "-";//硬座数
	private String noSeatNum = "-";//无座数
	private String othersNum = "-";//其他座数

//	private FinalTrainResult(ResultBuilder builder) {
//		this.trainCode = builder.trainCode;
//		this.fromStationName = builder.fromStationName;
//		this.fromStationCode = builder.fromStationCode;
//		this.toStationName = builder.toStationName;
//		this.toStationCode = builder.toStationCode;
//		this.departureStationName = builder.departureStationName;
//		this.departureStationCode = builder.departureStationCode;
//		this.destinationStationName = builder.destinationStationName;
//		this.destinationStationCode = builder.destinationStationCode;
//		this.startTime = builder.startTime;
//		this.arriveTime = builder.arriveTime;
//		this.lastTime = builder.lastTime;
//		this.dayDifference = builder.dayDifference;
//		this.canWebBuy = builder.canWebBuy;
//		this.startTrainDay = builder.startTrainDay;
//		this.dTrainSleeperNum = builder.dTrainSleeperNum;
//		this.businessSeatNum = builder.businessSeatNum;
//		this.topLevelSeatNum = builder.topLevelSeatNum;
//		this.secondLevelSeatNum = builder.secondLevelSeatNum;
//		this.seniorSoftSleeperNum = builder.seniorSoftSleeperNum;
//		this.softSleeperNum = builder.softSleeperNum;
//		this.hardSleeperNum = builder.hardSleeperNum;
//		this.softSeatNum = builder.softSeatNum;
//		this.hardSeatNum = builder.hardSeatNum;
//		this.noSeatNum = builder.noSeatNum;
//		this.othersNum = builder.othersNum;
//	}
//	public static class ResultBuilder {
//		private String  trainCode; //车次号
//		private String fromStationName; //出发站
//		private String fromStationCode; //出发站码
//		private String toStationName; //到达站
//		private String toStationCode; //到达站码
//		private String departureStationName; //始发站
//		private String departureStationCode; //始发站码
//		private String destinationStationName; //终点站
//		private String destinationStationCode; //终点站码
//		private String startTime; //出发时间
//		private String arriveTime; //到达时间
//		private String lastTime; //历时小时分钟数
//		private String dayDifference; //历时天数
//		private String canWebBuy; //Y 可以预订、N 不可预订、IS_TIME_NOT_BUY 没到预定时间
//		private String startTrainDay; //发车日
//		private String dTrainSleeperNum = "-"; //动卧
//		private String businessSeatNum = "-";//商务座数
//		private String topLevelSeatNum = "-";//一等座数
//		private String secondLevelSeatNum = "-";//二等座数
//		private String seniorSoftSleeperNum = "-";//高级软卧数
//		private String softSleeperNum = "-";//软卧数
//		private String hardSleeperNum = "-";//硬卧数
//		private String softSeatNum = "-";//软座数
//		private String hardSeatNum = "-";//硬座数
//		private String noSeatNum = "-";//无座数
//		private String othersNum = "-";//其他座数
//		
//		public ResultBuilder(){
//			//this.trainCode = trainCode;
//		}
//		public ResultBuilder trainCode(String trainCode){
//			this.trainCode = trainCode;
//			return this;
//		}
//		public ResultBuilder fromStationName(String fromStationName) {
//			this.fromStationName = fromStationName;
//			return this;
//		}
//		public ResultBuilder fromStationCode(String fromStationCode) {
//			this.fromStationCode = fromStationCode;
//			return this;
//		}
//		public ResultBuilder toStationName(String toStationName) {
//			this.toStationName = toStationName;
//			return this;
//		}
//		public ResultBuilder toStationCode(String toStationCode) {
//			this.toStationCode = toStationCode;
//			return this;
//		}
//		public ResultBuilder departureStationName(String departureStationName){
//			this.departureStationName = departureStationName;
//			return this;
//		}
//		public ResultBuilder departureStationCode(String departureStationCode){
//			this.departureStationCode = departureStationCode;
//			return this;
//		}
//		public ResultBuilder destinationStationName(String destinationStationName){
//			this.destinationStationName = destinationStationName;
//			return this;
//		}
//		public ResultBuilder destinationStationCode(String destinationStationCode){
//			this.destinationStationCode = destinationStationCode;
//			return this;
//		}
//		public ResultBuilder startTime(String startTime){
//			this.startTime = startTime;
//			return this;
//		}
//		public ResultBuilder arriveTime(String arriveTime){
//			this.arriveTime = arriveTime;
//			return this;
//		}
//		public ResultBuilder lastTime(String lastTime){
//			this.lastTime = lastTime;
//			return this;
//		}
//		public ResultBuilder dayDifference(String dayDifference){
//			this.dayDifference = dayDifference;
//			return this;
//		}
//		public ResultBuilder canWebBuy(String canWebBuy){
//			this.canWebBuy = canWebBuy;
//			return this;
//		}
//		public ResultBuilder startTrainDay(String startTrainDay){
//			this.startTrainDay = startTrainDay;
//			return this;
//		}
//		public ResultBuilder dTrainSleeperNum(String dTrainSleeperNum){
//			if ("".equals(dTrainSleeperNum) == false) {
//				this.dTrainSleeperNum = dTrainSleeperNum;
//			}
//			
//			return this;
//		}
//		public ResultBuilder businessSeatNum(String businessSeatNum){
//			if ("".equals(businessSeatNum) == false) {
//				this.businessSeatNum = businessSeatNum;
//			}
//			
//			return this;
//		}
//		public ResultBuilder topLevelSeatNum(String topLevelSeatNum){
//			if ("".equals(topLevelSeatNum) == false) {
//				this.topLevelSeatNum = topLevelSeatNum;
//			}
//			
//			return this;
//		}
//		public ResultBuilder secondLevelSeatNum(String secondLevelSeatNum){
//			if ("".equals(secondLevelSeatNum) == false) {
//				this.secondLevelSeatNum = secondLevelSeatNum;
//			}
//			
//			return this;
//		}
//		public ResultBuilder seniorSoftSleeperNum(String seniorSoftSleeperNum){
//			if ("".equals(seniorSoftSleeperNum) == false) {
//				this.seniorSoftSleeperNum = seniorSoftSleeperNum;
//			}
//			
//			return this;
//		}
//		public ResultBuilder softSleeperNum(String softSleeperNum){
//			if ("".equals(softSleeperNum) == false) {
//				this.softSleeperNum = softSleeperNum;
//			}
//			
//			return this;
//		}
//		public ResultBuilder hardSleeperNum(String hardSleeperNum){
//			if ("".equals(hardSleeperNum) == false) {
//				this.hardSleeperNum = hardSleeperNum;
//			}
//			return this;
//		}
//		public ResultBuilder softSeatNum(String softSeatNum){
//			if ("".equals(softSeatNum) == false) {
//				this.softSeatNum = softSeatNum;
//			}
//			
//			return this;
//		}
//		public ResultBuilder hardSeatNum(String hardSeatNum){
//			if ("".equals(noSeatNum) == false) {
//				this.hardSeatNum = hardSeatNum;
//			}
//			return this;
//		}
//		public ResultBuilder noSeatNum(String noSeatNum){
//			if ("".equals(noSeatNum) == false) {
//				this.noSeatNum = noSeatNum;
//			}
//			return this;
//		}	
//		public ResultBuilder othersNum(String othersNum){
//			this.othersNum = othersNum;
//			return this;
//		}
//		public FinalTrainResult build() {
//            return new FinalTrainResult(this);
//        }
//	}
	
//	public void setTrainCode(String trainCode){
//		this.trainCode = trainCode;
//	}
//	public String getTrainCode(){
//		return trainCode;
//	}
//	
//	public void setFromStationName(String fromStationName){
//		this.fromStationName = fromStationName;
//	}
//	public String getFromStationName(){
//		return fromStationName;
//	}
//	
//	public void setFromStationCode(String fromStationCode){
//		this.fromStationCode = fromStationCode;
//	}
//	public String getFromStationCode(){
//		return fromStationCode;
//	}
//	
//	public void setToStationName(String toStationName){
//		this.toStationName = toStationName;
//	}
//	public String getToStationName(){
//		return toStationName;
//	}
//	
//	public void setToStationCode(String toStationCode){
//		this.toStationCode = toStationCode;
//	}
//	public String getToStationCode(){
//		return toStationCode;
//	}
//	
//	public void setStartStationName(String startStationName){
//		this.departureStationName = startStationName;
//	}
//	public String getStartStationName(){
//		return departureStationName;
//	}
//	
//	public void setStartStationCode(String startStationCode){
//		this.departureStationCode = startStationCode;
//	}
//	public String getStartStationCode(){
//		return departureStationCode;
//	}
//	
//	public void setEndStationName(String endStationName){
//		this.destinationStationName = endStationName;
//	}
//	public String getEndStationName(){
//		return destinationStationName;
//	}
//	
//	public void setEndStationCode(String endStationCode){
//		this.destinationStationCode = endStationCode;
//	}
//	public String getEndStationCode(){
//		return destinationStationCode;
//	}
//	
//	public void setStartTime(String startTime){
//		this.startTime = startTime;
//	}
//	public String getStartTime(){
//		return startTime;
//	}
//	
//	public void setArriveTime(String arriveTime){
//		this.arriveTime = arriveTime;
//	}
//	public String getArriveTime(){
//		return arriveTime;
//	}
//	
//	public void setLastTime(String lastTime){
//		this.lastTime = lastTime;
//	}
//	public String getLastTime(){
//		return lastTime;
//	}
//	
//	public void setDayDifference(String dayDifference){
//		this.dayDifference = dayDifference;
//	}
//	public String getDayDifference(){
//		return dayDifference;
//	}
//	
//	public void setcanWebBuy(String canWebBuy){
//		this.canWebBuy = canWebBuy;
//	}
//	public String getCanWebBuy(){
//		return canWebBuy;
//	}
//	
//	public void setStartTrainDay(String startTrainDay) {
//		this.startTrainDay = startTrainDay;
//	}
//	public String getStartTrainDay() {
//		return startTrainDay;
//	}
//	
//	public void setDTrainSleeperNum(String dTrainSleeperNum) {
//		if ("".equals(dTrainSleeperNum) ==false) {
//			this.dTrainSleeperNum = dTrainSleeperNum; // 如果数据为空则不进行赋值，下同
//		}
//	}
//	public String getDTrainSleeperNum() {
//		return dTrainSleeperNum;
//	}
//	
//	public void setBusinessSeatNum(String businessSeatNum) {
//		if ("".equals(businessSeatNum) ==false) {
//			this.businessSeatNum = businessSeatNum;
//		}
//		this.businessSeatNum = businessSeatNum;
//	}
//	public String getBusinessSeatNum() {
//		return businessSeatNum;
//	}
//	
//	public void setTopLevelSeatNum(String topLevelSeatNum) {
//		if ("".equals(topLevelSeatNum) == false) {
//			this.topLevelSeatNum = topLevelSeatNum;
//		}
//	}
//	public String getTopLevelSeatNum() {
//		return topLevelSeatNum;
//	}
//	
//	public void setSecondLevelSeatNum(String secondLevelSeatNum) {
//		if ("".equals(secondLevelSeatNum) ==false) {
//			this.secondLevelSeatNum = secondLevelSeatNum;
//		}
//	}
//	public String getSecondLevelSeatNum() {
//		return secondLevelSeatNum;
//	}
//	
//	public void setSeniorSoftSleeperNum(String seniorSoftSleeperNum) {
//		if ("".equals(seniorSoftSleeperNum) == false) {
//			this.seniorSoftSleeperNum = seniorSoftSleeperNum;
//		}
//	}
//	public String getSeniorSoftSleeperNum() {
//		return seniorSoftSleeperNum;
//	}
//	
//	public void setSoftSleeperNum(String softSleeperNum) {
//		if ("".equals(softSleeperNum) == false) {
//			this.softSleeperNum = softSleeperNum;
//		}
//		
//	}
//	public String getSoftSleeperNum() {
//		return softSleeperNum;
//	}
//	
//	public void setHardSleeperNum(String hardSleeperNum) {
//		if ("".equals(hardSleeperNum) == false) {
//			this.hardSleeperNum = hardSleeperNum;
//		}
//	}
//	public String getHardSleeperNum() {
//		return hardSleeperNum;
//	}
//	
//	public void setSoftSeatNum(String softSeatNum) {
//		if ("".equals(softSeatNum) == false) {
//			this.softSeatNum = softSeatNum;
//		}
//	}
//	public String getSoftSeatNum(){
//		return softSeatNum;
//	}
//	
//	public void setHardSeatNum(String hardSeatNum) {
//		if ("".equals(hardSeatNum) == false) {
//			this.hardSeatNum = hardSeatNum;
//		}
//	}
//	public String getHardSeatNum() {
//		return hardSeatNum;
//	}
//	
//	public void setNoSeatNum(String noSeatNum){
//		if ("".equals(noSeatNum) == false) {
//			this.noSeatNum = noSeatNum;
//		}
//	}
//	public String getNoSeatNum(){
//		return noSeatNum;
//	}
//	
//	public void setOthersNum(String othersNum){
//		if ("".equals(othersNum) == false) {
//			this.othersNum = othersNum;
//		}
//	}
//	public String getOthersNum(){
//		return othersNum;
//	}

}
