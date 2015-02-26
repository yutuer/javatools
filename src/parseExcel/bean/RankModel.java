package parseExcel.bean;

public class RankModel{
	//名字
public final String name;

//类型
public final String type;

//数量
public final Integer exp;

//资源
public final String icon;

//等级奖励星币
public final Integer rewardGold;

//等级奖励太阳水
public final Integer rewardOil;



	public RankModel(String name,String type,Integer exp,String icon,Integer rewardGold,Integer rewardOil){
		this.name=name;
this.type=type;
this.exp=exp;
this.icon=icon;
this.rewardGold=rewardGold;
this.rewardOil=rewardOil;

	}

	public RankModel(String name,String type,String exp,String icon,String rewardGold,String rewardOil){
		this(name,type,Integer.parseInt(exp),icon,Integer.parseInt(rewardGold),Integer.parseInt(rewardOil));
	}
	
	@Override
	public String toString() {
		return "RankModel[name="+name+",type="+type+",exp="+exp+",icon="+icon+",rewardGold="+rewardGold+",rewardOil="+rewardOil+"]";
	}
		
}