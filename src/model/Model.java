package model;

public class Model {
	
	private float minCo2;
	private float maxCo2;
	
	
	public Model(){
		
	}
	
	public void add_Min_Max(float _minCo2, float _maxCo2) {
		this.minCo2 = _minCo2;
		this.maxCo2 = _maxCo2;
		
		
	}
	
	public float getMin() {
		return this.minCo2;
		
	}
	
	public float getMax() {
		return this.maxCo2;
	}

}
