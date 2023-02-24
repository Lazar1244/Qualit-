package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.PanelMain;

public class ControllerThanks implements ActionListener {

	PanelMain panel_main;
	
	public ControllerThanks(PanelMain panel_main) {
		this.panel_main = panel_main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		panel_main.changeCard();
	}

}