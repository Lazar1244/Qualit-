package view;

import java.awt.CardLayout;

import javax.swing.JPanel;

import controlleur.ControlleurTransports;

public class PanelMain extends JPanel {

	private static final long serialVersionUID = -2612707024400658468L;
	
	CardLayout card_layout;
	
	public PanelMain() {
		PanelTransports panel_transports = new PanelTransports();
		PanelThanks panel_thanks = new PanelThanks();
		
		card_layout = new CardLayout();
		
		this.setLayout(card_layout);
		
		this.add(panel_transports);
		this.add(panel_thanks);
		
		ControlleurTransports controller_buttons = new ControlleurTransports(this);
		
		panel_transports.addActionListener(controller_buttons);
		panel_thanks.addActionListener(controller_buttons);
	}
	
	public void changeCard() {
		card_layout.next(this);
	}
	
}