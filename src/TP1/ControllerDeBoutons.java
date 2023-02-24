package TP1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerDeBoutons implements ActionListener {

	PanelMain panel_main;
	
	public ControllerDeBoutons(PanelMain panel_main) {
		this.panel_main = panel_main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		panel_main.changeCard();
	}

}