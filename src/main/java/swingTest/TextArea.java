package swingTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextArea implements IJFramRun{
	
	private static final Logger logger = LoggerFactory.getLogger(TextArea.class);
	
	private JFrame frame;
	private JButton b1;
	private JButton b2;
	private JTextArea textArea;
	
	public TextArea() {
		super();
	}

	private void addListener(){
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logger.info("b1 " + Thread.currentThread().getName());
				for (String key : SwingEnv.getCountry().keySet()) {
					textArea.append(String.format("%s --- %s \n", key, SwingEnv.getCountry().get(key)));
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logger.info("b2 " + Thread.currentThread().getName());
				textArea.setText("");
			}
		});
	}

	public static void main(String[] args) {
		SwingConsole.run(new TextArea(), "textAreaTest", 475, 425);
	}

	@Override
	public void run() {
		logger.info("run " + Thread.currentThread().getName());
		
		b1 = new JButton("Add Data");
		b2 = new JButton("Clear Data");
		textArea = new JTextArea(5, 20);
		
		frame.setLayout(new FlowLayout());
		frame.add(new JScrollPane(textArea));
		frame.add(b1);
		frame.add(b2);
		
		addListener();
	}

	@Override
	public JFrame getFrame() {
		if(frame == null){
			frame = new JFrame();
		}
		return frame;
	}

}
