package swingTest.thinkinjava;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingConsole {
	
	public static void run(IJFramRun frameRun, String title, final int width, final int height){
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = frameRun.getFrame();
				
				frameRun.run();

				frame.setTitle(title);
				frame.setSize(width, height);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
	
}
