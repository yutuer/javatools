package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class TestShutDownHook {

	public TestShutDownHook() {
		super();
		doShutDown();
	}

	private void doShutDown() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println(1111111111);
			}
		});
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		new TestShutDownHook();

		Process process = Runtime.getRuntime().exec("javac");
		// OutputStream os = process.getOutputStream();
		// os.write("dir".getBytes());
		InputStream is = process.getErrorStream();
		InputStreamReader isr = new InputStreamReader(is, Charset.forName("GB2312"));
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		int waitFor = process.waitFor();

		System.out.println(waitFor);
	}
}
