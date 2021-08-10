package unitesting.unit1;

public class Calculator {
	private double value;
	
	Calculator(){
		this.value = 0.0;
	}
	
	Calculator(double value){
		this.value = value;
	}
	
	public void add(double num) {
		this.value += num;
	}
	public void subtract(double num) {
		this.value -= num;
	}
	public void multiply(double num) {
		this.value += num;
	}
	public void divide(double num) {
		if (num == 0) {
			return;
		}
		this.value /= num;
	}
	public double getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return "Value = " + this.value;
	}
}
