package pipei;

public class GeneralBeanTwo<One, Two> extends GeneralBeanOne<One> {

	private Two two;

	public GeneralBeanTwo(One one, Two two) {
		super(one);
		this.two = two;
	}

	public Two getTwo() {
		return two;
	}

	public void setTwo(Two two) {
		this.two = two;
	}

	@Override
	public String toString() {
		return "GeneralBeanTwo [two=" + two + "]";
	}

}
