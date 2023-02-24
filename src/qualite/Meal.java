package qualite;

public class Meal {
	
	
	
	private String type;
	private double QuantCo2;
	private double vegan = 0.4;
	private double végétarien = 0.5;
	private double boeuf = 7;
	private double viandeOuPoisson = 1.1;
	
	
	
	
	 Meal(String _typer){
		 if( _typer == "vegan"  ) {
			 
		 this.type = _typer;
		 this.QuantCo2 = this.vegan;
		 
		 }
		 else if(_typer == "végétarien") {
			 this.type = _typer;
			 this.QuantCo2 = this.végétarien;
			 
		 } else if(_typer == "boeuf") {
			 this.type = _typer;
			 this.QuantCo2 = this.boeuf;
			 
		 }else if(_typer == "viandeOuPoisson") {
			 this.type = _typer;
			 this.QuantCo2 = this.viandeOuPoisson;
			 
		 }
 
	}
	
	
	


	 
	 
	 
	 
	
	
	}
	
	


