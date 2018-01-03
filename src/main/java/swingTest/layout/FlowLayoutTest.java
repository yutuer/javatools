package swingTest.layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;

public class FlowLayoutTest {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		for(int i=0;i<10;i++){
			f.add(new Button("按钮" + i));
		}
		
		f.pack();
		f.setVisible(true);
	}
}
