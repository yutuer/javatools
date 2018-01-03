package swingTest.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("南"), BorderLayout.SOUTH);
		f.add(new Button("东"), BorderLayout.EAST);
		f.add(new Button("北"), BorderLayout.NORTH);
		f.add(new Button("西"), BorderLayout.WEST);
		
		f.add(new Button("中"));
		
		f.pack();
		f.setLocation(30, 30);
		f.setVisible(true);
	}
}
