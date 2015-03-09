package parseExcel.bean;

public class ArmoryModel{
		//种族
	private String raceType;
	//类型(1兵种,2技能)
	private Integer buildType;
	//baseId
	private Integer baseId;


	public ArmoryModel(){}

	public ArmoryModel(String raceType,Integer buildType,Integer baseId){
			this.raceType=raceType;
	this.buildType=buildType;
	this.baseId=baseId;

	}

	public ArmoryModel(String raceType,String buildType,String baseId){
		this(raceType,Integer.parseInt(buildType),Integer.parseInt(baseId));
	}
	
	public String getRaceType(){
 	return raceType;
}
public Integer getBuildType(){
 	return buildType;
}
public Integer getBaseId(){
 	return baseId;
}

	
	public void setRaceType(String raceType){
 	this.raceType=raceType;
}
public void setBuildType(Integer buildType){
 	this.buildType=buildType;
}
public void setBaseId(Integer baseId){
 	this.baseId=baseId;
}

	
	public String buildAddSql() {
		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("insert into `pureland`.`armory_model`(`race_type`,`build_type`,`base_id`) values('").append(this.getRaceType()).append("',").append(this.getBuildType()).append(",").append(this.getBaseId()).append(")");
		return sqlBuffer.toString();
	}
	
	@Override
	public String toString() {
		return "ArmoryModel[raceType="+raceType+", buildType="+buildType+", baseId="+baseId+"]";
	}
		
}
