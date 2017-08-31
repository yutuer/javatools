package threadTest.ThreadContextLoaderTest;

import java.net.URL;

public class ThreadContextLoaderTest {
	
	public static void main(String[] args) {
		Class<? extends MyClass> class1 = new MyClass().getClass();
		System.out.println(class1.getClassLoader());
		
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		URL resource = contextClassLoader.getResource("");
		final URL[] urls = new URL[]{resource};
		new Thread(new Runnable() {
			@Override
			public void run() {
				AgentJarClassLoader agentJarClassLoader = new AgentJarClassLoader(urls);
				Thread.currentThread().setContextClassLoader(agentJarClassLoader);	
				
				
				Class<? extends MyClass> class1 = new MyClass().getClass();
				System.out.println(class1.getClassLoader());
			}
		}).start();
	}
}
