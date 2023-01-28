package bubble.test.ex05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListner();
		setVisible(true);
	}

	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);

		player = new Player();
		add(player);
		// backgroundMap.setSize(100, 100);
		// backgroundMap.setLocation(300, 300);
		// backgroundMap.setSize(1000, 600);
		// add(backgroundMap); // JFrame에 JLabel이 그려진다.
	}

	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); // absoulte 레이아웃 (자유롭게 그림을 그릴 수 있다.)
		setLocationRelativeTo(null); // JFrame 가운데 배치하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 창을 끌 때 JVM 같이 종료하기
	}

	// 1. 그림 변경 시점: 이벤트 루프에 모든 임무(task)가 완료되어야 repaint가 된다.
	// 2. 메인스레드만 있으면 key 전달 -> 이벤트 루프에!! r r r or u u u

	private void initListner() {
		addKeyListener(new KeyAdapter() {
			// 키보드 클릭 이벤트 핸들러
			@Override
			public void keyPressed(KeyEvent e) {
				// System.out.println(e.getKeyCode());

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if (!player.isLeft()) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (!player.isRight()) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					if(!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;
//				case KeyEvent.VK_DOWN:
//					player.down();
//					break;
				}
			}

			// 키보드 해제 이벤트 핸들러
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
					break;
				}

			}

		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
