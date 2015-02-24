package parseExcel.bean;

public class RankModel {
	// 名字
	public final String name;

	// 类型
	public final String type;

	// 数量
	public final int exp;

	// 资源
	public final String icon;

	// 等级奖励星币
	public final int rewardGold;

	// 等级奖励太阳水
	public final int rewardOil;

	public RankModel(String name, String type, int exp, String icon, int rewardGold, int rewardOil) {
		this.name = name;
		this.type = type;
		this.exp = exp;
		this.icon = icon;
		this.rewardGold = rewardGold;
		this.rewardOil = rewardOil;
	}

}