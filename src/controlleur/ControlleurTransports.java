package controlleur;
import model.Model;
import view.PanelMain;

public class ControlleurTransports {
	
	private float valeurMin;
	private float valeurMax;
    Model model;
    PanelMain panelMain;
    
    ControlleurTransports(float _valeurMin, float _valeurMax, Model _model ,PanelMain _panelMain){
    	
    	this.valeurMin = _valeurMin;
    	this.valeurMax = _valeurMax;
    	this.model = _model;
    	this.panelMain = _panelMain;
    	
    }
    
    

}
