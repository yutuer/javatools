package swingTest;

import java.awt.Button;
import java.awt.Frame;

public class NullLayoutTest {
	
	Frame f = new Frame("测试窗口");
	Button b1 = new Button("第一个按钮");
	Button b2 = new Button("第二个按钮");

	public void init(){
		f.setLayout(null);
		
		b1.setBounds(20, 30, 90, 28);
		b2.setBounds(50, 45, 120, 35);
		f.add(b1);
		f.add(b2);
		
		f.setBounds(50, 50, 200, 100);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new NullLayoutTest().init();
	}
}
