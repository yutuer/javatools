package parseExcel.bean;

public class EntityModel{
		//id
	private Integer id;
	//baseId
	private Integer baseId;
	//upgradeId
	private Integer upgradeId;
	//raceType
	private String raceType;
	//entityType
	private String entityType;
	//subType
	private String subType;
	//nameForResource
	private String nameForResource;
	//nameForView
	private String nameForView;
	//level
	private Integer level;
	//buildNeedType
	private String buildNeedType;
	//buildNeedId
	private Integer buildNeedId;
	//upgradeNeedType
	private String upgradeNeedType;
	//upgradeNeedId
	private Integer upgradeNeedId;
	//hp
	private Integer hp;
	//costResourceType
	private String costResourceType;
	//costResourceCount
	private Integer costResourceCount;
	//buildTime
	private Long buildTime;
	//range
	private Integer range;
	//blindRange
	private Integer blindRange;
	//rate
	private Integer rate;
	//damage
	private Integer damage;
	//damageForView
	private Integer damageForView;
	//splashRange
	private Integer splashRange;
	//attackAngle
	private Integer attackAngle;
	//tileSize
	private Integer tileSize;
	//targetType
	private String targetType;
	//resourceType
	private String resourceType;
	//resourcePerSecond
	private Double resourcePerSecond;
	//resourcePerSecondForView
	private Integer resourcePerSecondForView;
	//maxResourceStorage
	private Integer maxResourceStorage;
	//buildExp
	private Integer buildExp;
	//spaceProvide
	private Integer spaceProvide;
	//queueSize
	private Integer queueSize;
	//workerProvide
	private Integer workerProvide;
	//refillCostResourceType
	private String refillCostResourceType;
	//refillCostResourceCount
	private Integer refillCostResourceCount;
	//freezeTime
	private Integer freezeTime;
	//aimTarget
	private String aimTarget;
	//bulletSpeed
	private Integer bulletSpeed;
	//bulletType
	private String bulletType;
	//numTarget
	private Integer numTarget;
	//bulletName
	private String bulletName;
	//fireEffectName
	private String fireEffectName;
	//hitEffectName
	private String hitEffectName;
	//buffEffectName
	private String buffEffectName;
	//buffType
	private String buffType;
	//buffDamage
	private Integer buffDamage;
	//buffActiveTimes
	private Integer buffActiveTimes;
	//buffIntervalTime
	private Integer buffIntervalTime;
	//defense
	private Integer defense;
	//defenseForView
	private Integer defenseForView;
	//additionDamageSubType
	private String additionDamageSubType;
	//additionDamageRatio
	private Integer additionDamageRatio;
	//trainCostResourceType
	private String trainCostResourceType;
	//trainCostResourceCount
	private Integer trainCostResourceCount;
	//trainTime
	private Integer trainTime;
	//speed
	private Integer speed;
	//cure
	private Integer cure;
	//cureForView
	private Integer cureForView;
	//cureRange
	private Integer cureRange;
	//spaceUse
	private Integer spaceUse;
	//desc
	private String desc;


	public EntityModel(Integer id,Integer baseId,Integer upgradeId,String raceType,String entityType,String subType,String nameForResource,String nameForView,Integer level,String buildNeedType,Integer buildNeedId,String upgradeNeedType,Integer upgradeNeedId,Integer hp,String costResourceType,Integer costResourceCount,Long buildTime,Integer range,Integer blindRange,Integer rate,Integer damage,Integer damageForView,Integer splashRange,Integer attackAngle,Integer tileSize,String targetType,String resourceType,Double resourcePerSecond,Integer resourcePerSecondForView,Integer maxResourceStorage,Integer buildExp,Integer spaceProvide,Integer queueSize,Integer workerProvide,String refillCostResourceType,Integer refillCostResourceCount,Integer freezeTime,String aimTarget,Integer bulletSpeed,String bulletType,Integer numTarget,String bulletName,String fireEffectName,String hitEffectName,String buffEffectName,String buffType,Integer buffDamage,Integer buffActiveTimes,Integer buffIntervalTime,Integer defense,Integer defenseForView,String additionDamageSubType,Integer additionDamageRatio,String trainCostResourceType,Integer trainCostResourceCount,Integer trainTime,Integer speed,Integer cure,Integer cureForView,Integer cureRange,Integer spaceUse,String desc){
			this.id=id;
	this.baseId=baseId;
	this.upgradeId=upgradeId;
	this.raceType=raceType;
	this.entityType=entityType;
	this.subType=subType;
	this.nameForResource=nameForResource;
	this.nameForView=nameForView;
	this.level=level;
	this.buildNeedType=buildNeedType;
	this.buildNeedId=buildNeedId;
	this.upgradeNeedType=upgradeNeedType;
	this.upgradeNeedId=upgradeNeedId;
	this.hp=hp;
	this.costResourceType=costResourceType;
	this.costResourceCount=costResourceCount;
	this.buildTime=buildTime;
	this.range=range;
	this.blindRange=blindRange;
	this.rate=rate;
	this.damage=damage;
	this.damageForView=damageForView;
	this.splashRange=splashRange;
	this.attackAngle=attackAngle;
	this.tileSize=tileSize;
	this.targetType=targetType;
	this.resourceType=resourceType;
	this.resourcePerSecond=resourcePerSecond;
	this.resourcePerSecondForView=resourcePerSecondForView;
	this.maxResourceStorage=maxResourceStorage;
	this.buildExp=buildExp;
	this.spaceProvide=spaceProvide;
	this.queueSize=queueSize;
	this.workerProvide=workerProvide;
	this.refillCostResourceType=refillCostResourceType;
	this.refillCostResourceCount=refillCostResourceCount;
	this.freezeTime=freezeTime;
	this.aimTarget=aimTarget;
	this.bulletSpeed=bulletSpeed;
	this.bulletType=bulletType;
	this.numTarget=numTarget;
	this.bulletName=bulletName;
	this.fireEffectName=fireEffectName;
	this.hitEffectName=hitEffectName;
	this.buffEffectName=buffEffectName;
	this.buffType=buffType;
	this.buffDamage=buffDamage;
	this.buffActiveTimes=buffActiveTimes;
	this.buffIntervalTime=buffIntervalTime;
	this.defense=defense;
	this.defenseForView=defenseForView;
	this.additionDamageSubType=additionDamageSubType;
	this.additionDamageRatio=additionDamageRatio;
	this.trainCostResourceType=trainCostResourceType;
	this.trainCostResourceCount=trainCostResourceCount;
	this.trainTime=trainTime;
	this.speed=speed;
	this.cure=cure;
	this.cureForView=cureForView;
	this.cureRange=cureRange;
	this.spaceUse=spaceUse;
	this.desc=desc;

	}

	public EntityModel(String id,String baseId,String upgradeId,String raceType,String entityType,String subType,String nameForResource,String nameForView,String level,String buildNeedType,String buildNeedId,String upgradeNeedType,String upgradeNeedId,String hp,String costResourceType,String costResourceCount,String buildTime,String range,String blindRange,String rate,String damage,String damageForView,String splashRange,String attackAngle,String tileSize,String targetType,String resourceType,String resourcePerSecond,String resourcePerSecondForView,String maxResourceStorage,String buildExp,String spaceProvide,String queueSize,String workerProvide,String refillCostResourceType,String refillCostResourceCount,String freezeTime,String aimTarget,String bulletSpeed,String bulletType,String numTarget,String bulletName,String fireEffectName,String hitEffectName,String buffEffectName,String buffType,String buffDamage,String buffActiveTimes,String buffIntervalTime,String defense,String defenseForView,String additionDamageSubType,String additionDamageRatio,String trainCostResourceType,String trainCostResourceCount,String trainTime,String speed,String cure,String cureForView,String cureRange,String spaceUse,String desc){
		this(Integer.parseInt(id),Integer.parseInt(baseId),Integer.parseInt(upgradeId),raceType,entityType,subType,nameForResource,nameForView,Integer.parseInt(level),buildNeedType,Integer.parseInt(buildNeedId),upgradeNeedType,Integer.parseInt(upgradeNeedId),Integer.parseInt(hp),costResourceType,Integer.parseInt(costResourceCount),Long.parseLong(buildTime),Integer.parseInt(range),Integer.parseInt(blindRange),Integer.parseInt(rate),Integer.parseInt(damage),Integer.parseInt(damageForView),Integer.parseInt(splashRange),Integer.parseInt(attackAngle),Integer.parseInt(tileSize),targetType,resourceType,Double.parseDouble(resourcePerSecond),Integer.parseInt(resourcePerSecondForView),Integer.parseInt(maxResourceStorage),Integer.parseInt(buildExp),Integer.parseInt(spaceProvide),Integer.parseInt(queueSize),Integer.parseInt(workerProvide),refillCostResourceType,Integer.parseInt(refillCostResourceCount),Integer.parseInt(freezeTime),aimTarget,Integer.parseInt(bulletSpeed),bulletType,Integer.parseInt(numTarget),bulletName,fireEffectName,hitEffectName,buffEffectName,buffType,Integer.parseInt(buffDamage),Integer.parseInt(buffActiveTimes),Integer.parseInt(buffIntervalTime),Integer.parseInt(defense),Integer.parseInt(defenseForView),additionDamageSubType,Integer.parseInt(additionDamageRatio),trainCostResourceType,Integer.parseInt(trainCostResourceCount),Integer.parseInt(trainTime),Integer.parseInt(speed),Integer.parseInt(cure),Integer.parseInt(cureForView),Integer.parseInt(cureRange),Integer.parseInt(spaceUse),desc);
	}
	
	public Integer getId(){
 	return id;
}
public Integer getBaseId(){
 	return baseId;
}
public Integer getUpgradeId(){
 	return upgradeId;
}
public String getRaceType(){
 	return raceType;
}
public String getEntityType(){
 	return entityType;
}
public String getSubType(){
 	return subType;
}
public String getNameForResource(){
 	return nameForResource;
}
public String getNameForView(){
 	return nameForView;
}
public Integer getLevel(){
 	return level;
}
public String getBuildNeedType(){
 	return buildNeedType;
}
public Integer getBuildNeedId(){
 	return buildNeedId;
}
public String getUpgradeNeedType(){
 	return upgradeNeedType;
}
public Integer getUpgradeNeedId(){
 	return upgradeNeedId;
}
public Integer getHp(){
 	return hp;
}
public String getCostResourceType(){
 	return costResourceType;
}
public Integer getCostResourceCount(){
 	return costResourceCount;
}
public Long getBuildTime(){
 	return buildTime;
}
public Integer getRange(){
 	return range;
}
public Integer getBlindRange(){
 	return blindRange;
}
public Integer getRate(){
 	return rate;
}
public Integer getDamage(){
 	return damage;
}
public Integer getDamageForView(){
 	return damageForView;
}
public Integer getSplashRange(){
 	return splashRange;
}
public Integer getAttackAngle(){
 	return attackAngle;
}
public Integer getTileSize(){
 	return tileSize;
}
public String getTargetType(){
 	return targetType;
}
public String getResourceType(){
 	return resourceType;
}
public Double getResourcePerSecond(){
 	return resourcePerSecond;
}
public Integer getResourcePerSecondForView(){
 	return resourcePerSecondForView;
}
public Integer getMaxResourceStorage(){
 	return maxResourceStorage;
}
public Integer getBuildExp(){
 	return buildExp;
}
public Integer getSpaceProvide(){
 	return spaceProvide;
}
public Integer getQueueSize(){
 	return queueSize;
}
public Integer getWorkerProvide(){
 	return workerProvide;
}
public String getRefillCostResourceType(){
 	return refillCostResourceType;
}
public Integer getRefillCostResourceCount(){
 	return refillCostResourceCount;
}
public Integer getFreezeTime(){
 	return freezeTime;
}
public String getAimTarget(){
 	return aimTarget;
}
public Integer getBulletSpeed(){
 	return bulletSpeed;
}
public String getBulletType(){
 	return bulletType;
}
public Integer getNumTarget(){
 	return numTarget;
}
public String getBulletName(){
 	return bulletName;
}
public String getFireEffectName(){
 	return fireEffectName;
}
public String getHitEffectName(){
 	return hitEffectName;
}
public String getBuffEffectName(){
 	return buffEffectName;
}
public String getBuffType(){
 	return buffType;
}
public Integer getBuffDamage(){
 	return buffDamage;
}
public Integer getBuffActiveTimes(){
 	return buffActiveTimes;
}
public Integer getBuffIntervalTime(){
 	return buffIntervalTime;
}
public Integer getDefense(){
 	return defense;
}
public Integer getDefenseForView(){
 	return defenseForView;
}
public String getAdditionDamageSubType(){
 	return additionDamageSubType;
}
public Integer getAdditionDamageRatio(){
 	return additionDamageRatio;
}
public String getTrainCostResourceType(){
 	return trainCostResourceType;
}
public Integer getTrainCostResourceCount(){
 	return trainCostResourceCount;
}
public Integer getTrainTime(){
 	return trainTime;
}
public Integer getSpeed(){
 	return speed;
}
public Integer getCure(){
 	return cure;
}
public Integer getCureForView(){
 	return cureForView;
}
public Integer getCureRange(){
 	return cureRange;
}
public Integer getSpaceUse(){
 	return spaceUse;
}
public String getDesc(){
 	return desc;
}

	
	public void setId(Integer id){
 	this.id=id;
}
public void setBaseId(Integer baseId){
 	this.baseId=baseId;
}
public void setUpgradeId(Integer upgradeId){
 	this.upgradeId=upgradeId;
}
public void setRaceType(String raceType){
 	this.raceType=raceType;
}
public void setEntityType(String entityType){
 	this.entityType=entityType;
}
public void setSubType(String subType){
 	this.subType=subType;
}
public void setNameForResource(String nameForResource){
 	this.nameForResource=nameForResource;
}
public void setNameForView(String nameForView){
 	this.nameForView=nameForView;
}
public void setLevel(Integer level){
 	this.level=level;
}
public void setBuildNeedType(String buildNeedType){
 	this.buildNeedType=buildNeedType;
}
public void setBuildNeedId(Integer buildNeedId){
 	this.buildNeedId=buildNeedId;
}
public void setUpgradeNeedType(String upgradeNeedType){
 	this.upgradeNeedType=upgradeNeedType;
}
public void setUpgradeNeedId(Integer upgradeNeedId){
 	this.upgradeNeedId=upgradeNeedId;
}
public void setHp(Integer hp){
 	this.hp=hp;
}
public void setCostResourceType(String costResourceType){
 	this.costResourceType=costResourceType;
}
public void setCostResourceCount(Integer costResourceCount){
 	this.costResourceCount=costResourceCount;
}
public void setBuildTime(Long buildTime){
 	this.buildTime=buildTime;
}
public void setRange(Integer range){
 	this.range=range;
}
public void setBlindRange(Integer blindRange){
 	this.blindRange=blindRange;
}
public void setRate(Integer rate){
 	this.rate=rate;
}
public void setDamage(Integer damage){
 	this.damage=damage;
}
public void setDamageForView(Integer damageForView){
 	this.damageForView=damageForView;
}
public void setSplashRange(Integer splashRange){
 	this.splashRange=splashRange;
}
public void setAttackAngle(Integer attackAngle){
 	this.attackAngle=attackAngle;
}
public void setTileSize(Integer tileSize){
 	this.tileSize=tileSize;
}
public void setTargetType(String targetType){
 	this.targetType=targetType;
}
public void setResourceType(String resourceType){
 	this.resourceType=resourceType;
}
public void setResourcePerSecond(Double resourcePerSecond){
 	this.resourcePerSecond=resourcePerSecond;
}
public void setResourcePerSecondForView(Integer resourcePerSecondForView){
 	this.resourcePerSecondForView=resourcePerSecondForView;
}
public void setMaxResourceStorage(Integer maxResourceStorage){
 	this.maxResourceStorage=maxResourceStorage;
}
public void setBuildExp(Integer buildExp){
 	this.buildExp=buildExp;
}
public void setSpaceProvide(Integer spaceProvide){
 	this.spaceProvide=spaceProvide;
}
public void setQueueSize(Integer queueSize){
 	this.queueSize=queueSize;
}
public void setWorkerProvide(Integer workerProvide){
 	this.workerProvide=workerProvide;
}
public void setRefillCostResourceType(String refillCostResourceType){
 	this.refillCostResourceType=refillCostResourceType;
}
public void setRefillCostResourceCount(Integer refillCostResourceCount){
 	this.refillCostResourceCount=refillCostResourceCount;
}
public void setFreezeTime(Integer freezeTime){
 	this.freezeTime=freezeTime;
}
public void setAimTarget(String aimTarget){
 	this.aimTarget=aimTarget;
}
public void setBulletSpeed(Integer bulletSpeed){
 	this.bulletSpeed=bulletSpeed;
}
public void setBulletType(String bulletType){
 	this.bulletType=bulletType;
}
public void setNumTarget(Integer numTarget){
 	this.numTarget=numTarget;
}
public void setBulletName(String bulletName){
 	this.bulletName=bulletName;
}
public void setFireEffectName(String fireEffectName){
 	this.fireEffectName=fireEffectName;
}
public void setHitEffectName(String hitEffectName){
 	this.hitEffectName=hitEffectName;
}
public void setBuffEffectName(String buffEffectName){
 	this.buffEffectName=buffEffectName;
}
public void setBuffType(String buffType){
 	this.buffType=buffType;
}
public void setBuffDamage(Integer buffDamage){
 	this.buffDamage=buffDamage;
}
public void setBuffActiveTimes(Integer buffActiveTimes){
 	this.buffActiveTimes=buffActiveTimes;
}
public void setBuffIntervalTime(Integer buffIntervalTime){
 	this.buffIntervalTime=buffIntervalTime;
}
public void setDefense(Integer defense){
 	this.defense=defense;
}
public void setDefenseForView(Integer defenseForView){
 	this.defenseForView=defenseForView;
}
public void setAdditionDamageSubType(String additionDamageSubType){
 	this.additionDamageSubType=additionDamageSubType;
}
public void setAdditionDamageRatio(Integer additionDamageRatio){
 	this.additionDamageRatio=additionDamageRatio;
}
public void setTrainCostResourceType(String trainCostResourceType){
 	this.trainCostResourceType=trainCostResourceType;
}
public void setTrainCostResourceCount(Integer trainCostResourceCount){
 	this.trainCostResourceCount=trainCostResourceCount;
}
public void setTrainTime(Integer trainTime){
 	this.trainTime=trainTime;
}
public void setSpeed(Integer speed){
 	this.speed=speed;
}
public void setCure(Integer cure){
 	this.cure=cure;
}
public void setCureForView(Integer cureForView){
 	this.cureForView=cureForView;
}
public void setCureRange(Integer cureRange){
 	this.cureRange=cureRange;
}
public void setSpaceUse(Integer spaceUse){
 	this.spaceUse=spaceUse;
}
public void setDesc(String desc){
 	this.desc=desc;
}

	
	public String buildAddSql() {
		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("insert into `pureland`.`entity_model`(`id`,`base_id`,`upgrade_id`,`race_type`,`entity_type`,`sub_type`,`name_for_resource`,`name_for_view`,`level`,`build_need_type`,`build_need_id`,`upgrade_need_type`,`upgrade_need_id`,`hp`,`cost_resource_type`,`cost_resource_count`,`build_time`,`range`,`blind_range`,`rate`,`damage`,`damage_for_view`,`splash_range`,`attack_angle`,`tile_size`,`target_type`,`resource_type`,`resource_per_second`,`resource_per_second_for_view`,`max_resource_storage`,`build_exp`,`space_provide`,`queue_size`,`worker_provide`,`refill_cost_resource_type`,`refill_cost_resource_count`,`freeze_time`,`aim_target`,`bullet_speed`,`bullet_type`,`num_target`,`bullet_name`,`fire_effect_name`,`hit_effect_name`,`buff_effect_name`,`buff_type`,`buff_damage`,`buff_active_times`,`buff_interval_time`,`defense`,`defense_for_view`,`addition_damage_sub_type`,`addition_damage_ratio`,`train_cost_resource_type`,`train_cost_resource_count`,`train_time`,`speed`,`cure`,`cure_for_view`,`cure_range`,`space_use`,`desc`) values(").append(this.getId()).append(",").append(this.getBaseId()).append(",").append(this.getUpgradeId()).append(",'").append(this.getRaceType()).append("','").append(this.getEntityType()).append("','").append(this.getSubType()).append("','").append(this.getNameForResource()).append("','").append(this.getNameForView()).append("',").append(this.getLevel()).append(",'").append(this.getBuildNeedType()).append("',").append(this.getBuildNeedId()).append(",'").append(this.getUpgradeNeedType()).append("',").append(this.getUpgradeNeedId()).append(",").append(this.getHp()).append(",'").append(this.getCostResourceType()).append("',").append(this.getCostResourceCount()).append(",").append(this.getBuildTime()).append(",").append(this.getRange()).append(",").append(this.getBlindRange()).append(",").append(this.getRate()).append(",").append(this.getDamage()).append(",").append(this.getDamageForView()).append(",").append(this.getSplashRange()).append(",").append(this.getAttackAngle()).append(",").append(this.getTileSize()).append(",'").append(this.getTargetType()).append("','").append(this.getResourceType()).append("',").append(this.getResourcePerSecond()).append(",").append(this.getResourcePerSecondForView()).append(",").append(this.getMaxResourceStorage()).append(",").append(this.getBuildExp()).append(",").append(this.getSpaceProvide()).append(",").append(this.getQueueSize()).append(",").append(this.getWorkerProvide()).append(",'").append(this.getRefillCostResourceType()).append("',").append(this.getRefillCostResourceCount()).append(",").append(this.getFreezeTime()).append(",'").append(this.getAimTarget()).append("',").append(this.getBulletSpeed()).append(",'").append(this.getBulletType()).append("',").append(this.getNumTarget()).append(",'").append(this.getBulletName()).append("','").append(this.getFireEffectName()).append("','").append(this.getHitEffectName()).append("','").append(this.getBuffEffectName()).append("','").append(this.getBuffType()).append("',").append(this.getBuffDamage()).append(",").append(this.getBuffActiveTimes()).append(",").append(this.getBuffIntervalTime()).append(",").append(this.getDefense()).append(",").append(this.getDefenseForView()).append(",'").append(this.getAdditionDamageSubType()).append("',").append(this.getAdditionDamageRatio()).append(",'").append(this.getTrainCostResourceType()).append("',").append(this.getTrainCostResourceCount()).append(",").append(this.getTrainTime()).append(",").append(this.getSpeed()).append(",").append(this.getCure()).append(",").append(this.getCureForView()).append(",").append(this.getCureRange()).append(",").append(this.getSpaceUse()).append(",'").append(this.getDesc()).append("')");
		return sqlBuffer.toString();
	}
	
	@Override
	public String toString() {
		return "EntityModel[id="+id+", baseId="+baseId+", upgradeId="+upgradeId+", raceType="+raceType+", entityType="+entityType+", subType="+subType+", nameForResource="+nameForResource+", nameForView="+nameForView+", level="+level+", buildNeedType="+buildNeedType+", buildNeedId="+buildNeedId+", upgradeNeedType="+upgradeNeedType+", upgradeNeedId="+upgradeNeedId+", hp="+hp+", costResourceType="+costResourceType+", costResourceCount="+costResourceCount+", buildTime="+buildTime+", range="+range+", blindRange="+blindRange+", rate="+rate+", damage="+damage+", damageForView="+damageForView+", splashRange="+splashRange+", attackAngle="+attackAngle+", tileSize="+tileSize+", targetType="+targetType+", resourceType="+resourceType+", resourcePerSecond="+resourcePerSecond+", resourcePerSecondForView="+resourcePerSecondForView+", maxResourceStorage="+maxResourceStorage+", buildExp="+buildExp+", spaceProvide="+spaceProvide+", queueSize="+queueSize+", workerProvide="+workerProvide+", refillCostResourceType="+refillCostResourceType+", refillCostResourceCount="+refillCostResourceCount+", freezeTime="+freezeTime+", aimTarget="+aimTarget+", bulletSpeed="+bulletSpeed+", bulletType="+bulletType+", numTarget="+numTarget+", bulletName="+bulletName+", fireEffectName="+fireEffectName+", hitEffectName="+hitEffectName+", buffEffectName="+buffEffectName+", buffType="+buffType+", buffDamage="+buffDamage+", buffActiveTimes="+buffActiveTimes+", buffIntervalTime="+buffIntervalTime+", defense="+defense+", defenseForView="+defenseForView+", additionDamageSubType="+additionDamageSubType+", additionDamageRatio="+additionDamageRatio+", trainCostResourceType="+trainCostResourceType+", trainCostResourceCount="+trainCostResourceCount+", trainTime="+trainTime+", speed="+speed+", cure="+cure+", cureForView="+cureForView+", cureRange="+cureRange+", spaceUse="+spaceUse+", desc="+desc+"]";
	}
		
}
