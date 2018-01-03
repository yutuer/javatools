package swingTest.layout;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class BoxLayoutTest {
	
	private Frame f = new Frame("测试");
	Button b1 = new Button("第一个按钮");
	Button b2 = new Button("第二个按钮");
	
	public void init(){
		f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));
//		b1.setBounds(20, 30, 90, 28); //不起作用
		f.add(b1);
		f.add(b2);
		
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BoxLayoutTest().init();
	}
}
