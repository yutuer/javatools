package pipei;

import util.MyUtil;

public class Clan {

	private static final int Max = 5;
	public int clanId;
	public int score;
	public final long startTime = System.currentTimeMillis();

	public Clan(int clanId, int score) {
		super();
		this.clanId = clanId;
		this.score = score;
	}

	public int getClanId() {
		return clanId;
	}

	public void setClanId(int clanId) {
		this.clanId = clanId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getRate() {
		long now = System.currentTimeMillis();
		long ret = (now - startTime) / (30 * MyUtil.SECOND);
		ret = ret > Max ? Max : ret;
		return (ret + 1) * 0.05;
	}

	public static void main(String[] args) throws InterruptedException {
		Clan c = new Clan(1, 500);
		Thread.sleep(31 * MyUtil.SECOND);
		System.out.println(c.getRate());
	}

	@Override
	public String toString() {
		return "Clan [clanId=" + clanId + ", score=" + score + "]";
	}

}
