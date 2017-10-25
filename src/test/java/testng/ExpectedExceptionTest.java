package testng;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :"+ i);
    }

}
