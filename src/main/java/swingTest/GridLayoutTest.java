package swingTest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class GridLayoutTest {
	public static void main(String[] args) {
		Frame f = new Frame("计算器");
		Panel p = new Panel();
		p.add(new TextField(30));
		f.add(p, BorderLayout.NORTH);
		
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 5, 4, 4));
		String[] name = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "."};
		for(int i=0;i<name.length;i++){
			p2.add(new Button(name[i]));
		}
		f.add(p2);
		
		f.pack();
		f.setVisible(true);
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("over");
	}
}
