package parseExcel.bean;

public class BuildingLimitModel{
		//基地id
	private Integer baseId;
	//建筑id
	private Integer buildingBaseId;
	//建筑最大数量
	private Integer buildingCount;
	//名字
	private String 列1;


	public BuildingLimitModel(){}

	public BuildingLimitModel(Integer baseId,Integer buildingBaseId,Integer buildingCount,String 列1){
			this.baseId=baseId;
	this.buildingBaseId=buildingBaseId;
	this.buildingCount=buildingCount;
	this.列1=列1;

	}

	public BuildingLimitModel(String baseId,String buildingBaseId,String buildingCount,String 列1){
		this(Integer.parseInt(baseId),Integer.parseInt(buildingBaseId),Integer.parseInt(buildingCount),列1);
	}
	
	public Integer getBaseId(){
 	return baseId;
}
public Integer getBuildingBaseId(){
 	return buildingBaseId;
}
public Integer getBuildingCount(){
 	return buildingCount;
}
public String get列1(){
 	return 列1;
}

	
	public void setBaseId(Integer baseId){
 	this.baseId=baseId;
}
public void setBuildingBaseId(Integer buildingBaseId){
 	this.buildingBaseId=buildingBaseId;
}
public void setBuildingCount(Integer buildingCount){
 	this.buildingCount=buildingCount;
}
public void set列1(String 列1){
 	this.列1=列1;
}

	
	public String buildAddSql() {
		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("insert into `pureland`.`building_limit_model`(`base_id`,`building_base_id`,`building_count`,`列1`) values(").append(this.getBaseId()).append(",").append(this.getBuildingBaseId()).append(",").append(this.getBuildingCount()).append(",").append(this.get列1()).append(")");
		return sqlBuffer.toString();
	}
	
	@Override
	public String toString() {
		return "BuildingLimitModel[baseId="+baseId+", buildingBaseId="+buildingBaseId+", buildingCount="+buildingCount+", 列1="+列1+"]";
	}
		
}
