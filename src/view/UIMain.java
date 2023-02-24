package view;

import javax.swing.JFrame;

public class UIMain {
	
	JFrame frame;
	
	public UIMain() {
		frame = new JFrame();
		frame.setContentPane(new PanelMain());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new UIMain();
	}

}
