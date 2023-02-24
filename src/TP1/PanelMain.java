package TP1;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class PanelMain extends JPanel {

	private static final long serialVersionUID = -2612707024400658468L;
	
	CardLayout card_layout;
	
	public PanelMain() {
		PanelWelcome panel_welcome = new PanelWelcome();
		PanelThanks panel_thanks = new PanelThanks();
		
		card_layout = new CardLayout();
		
		this.setLayout(card_layout);
		
		this.add(panel_welcome);
		this.add(panel_thanks);
		
		ControllerDeBoutons controller_buttons = new ControllerDeBoutons(this);
		
		panel_welcome.addActionListener(controller_buttons);
		panel_thanks.addActionListener(controller_buttons);
	}
	
	public void changeCard() {
		card_layout.next(this);
	}
	
}