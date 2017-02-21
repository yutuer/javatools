package test;

public class TestWeakRef {
	
	private String methodName;
	
	public static void main(String[] args) {
		System.out.println(new TestWeakRef().getMethodName());
	}
	
	public String getMethodName(){
		if(methodName != null){
			return methodName;
		}
		StackTraceElement[] stes = Thread.currentThread().getStackTrace();
		methodName = stes[2].getMethodName();
		return methodName;
	}
}
