package test;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketInputSteamTest {
	
	public static void main(String[] args) throws IOException {
		byte[] buf = new byte[1024];
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println(socket.getSoTimeout());
			socket.connect(new InetSocketAddress("localhost", 8080));
			System.out.println("connect success!!!!!");
			InputStream inputStream = socket.getInputStream();
			int read = inputStream.read(buf); //如果对端没有数据, 方法将会在socketInputStream.read上面阻塞, 但是线程状态却是RUNNABLE
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			socket.close();
		}
		
	}
}
