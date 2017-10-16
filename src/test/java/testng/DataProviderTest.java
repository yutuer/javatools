package testng;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "range-dataProvider")
	public void testIfBetween(int n, int lower, int upper, boolean expected) {
		System.out.printf("Received %d %d-%d, expect:%b\n", n, lower, upper, expected);
		Assert.assertEquals(expected, isBetween(n, lower, upper));
	}

	private boolean isBetween(int n, int lower, int upper) {
		return n >= lower && n <= upper;
	}

	@DataProvider(name = "range-dataProvider")
	public Object[][] rangeData() {
		int lower = 3;
		int upper = 10;
		return new Object[][] { { lower - 1, lower, upper, false }, { lower, lower, upper, true },
				{ lower + 1, lower, upper, true }, { upper, lower, upper, true }, { upper + 1, lower, upper, false }, };
	}

	@DataProvider
	public Object[][] provideName(Method method) {
		if (method.getName().equals("two")) {
			return new Object[][] { new Object[] { 2 } };
		} else if (method.getName().equals("three")) {
			return new Object[][] { new Object[] { 3 } };
		}
		return null;
	}

	@Test(dataProvider = "provideName")
	private void two(int param) {
		assertEquals(param, 2);
	}

	@Test(dataProvider = "provideName")
	private void three(int param) {
		assertEquals(param, 3);
	}
}
