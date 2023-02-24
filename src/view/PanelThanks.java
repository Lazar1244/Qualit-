package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlleur.ControllerThanks;

public class PanelThanks extends JPanel {
	
	private static final long serialVersionUID = 2261476464607071577L;
	
	JButton button;
	JLabel label;
	
	public PanelThanks() {
		this.setLayout(new FlowLayout());
		button = new JButton("Nouveau");
		label = new JLabel("Merci !");
		
		add(button);
		add(label);
	}
	
	public void addActionListener(ControllerThanks controller) {
		button.addActionListener(controller);
	}
}
