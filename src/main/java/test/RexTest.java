package test;

public class RexTest {
	public static void main(String[] args) {
		String rexStr = "0,2,2;10,1,2;";
		
		String[] splitReward = rexStr.split(";");
		for (String str : splitReward) {
			String[] d = str.split(",");
			System.out.println(str);
		}
	}
}
