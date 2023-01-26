package bubble.test.ex01;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

// 1. 윈도우 창이 되었음.
// 2. 윈도우 창은 내부에 패널을 하나 가지고 있음.
public class BubbleFrame extends JFrame{

	
	public BubbleFrame() throws HeadlessException {
		setSize(1000, 640);
		setVisible(true); // 그림을 그려라
	}


	public static void main(String[] args) {
		new BubbleFrame();
	}
	
	
}