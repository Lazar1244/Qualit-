package TP1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelWelcome extends JPanel {

	private static final long serialVersionUID = -1476284462545504601L;
	
	JButton button;
	JLabel label;
	
	public PanelWelcome() {
		this.setLayout(new FlowLayout());
		button = new JButton("Commencer");
		label = new JLabel("Bienvenue !");
		
		add(button);
		add(label);
	}
	
	public void addActionListener(ControllerDeBoutons controller) {
		button.addActionListener(controller);
	}
}