package parseExcel.bean;

public class ArmoryModel {
	// id
	public final Integer id;

	// 种族
	public final String raceType;

	// 类型(1兵种,2技能)
	public final Integer buildType;

	// baseId
	public final Integer baseId;

	public ArmoryModel(Integer id, String raceType, Integer buildType, Integer baseId) {
		this.id = id;
		this.raceType = raceType;
		this.buildType = buildType;
		this.baseId = baseId;

	}

	public ArmoryModel(String id, String raceType, String buildType, String baseId) {
		this(Integer.parseInt(id), raceType, Integer.parseInt(buildType), Integer.parseInt(baseId));
	}

	@Override
	public String toString() {
		return "ArmoryModel[id=" + id + ", raceType=" + raceType + ", buildType=" + buildType + ", baseId=" + baseId + "]";
	}

}