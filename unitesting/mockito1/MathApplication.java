package unitesting.mockito1;

public class MathApplication {
	   private ICalculator icalculator;
	   
	   public double complexOperation(double input1, double input2) {
			// TODO Auto-generated method stub
			double num1 = icalculator.add(input1, input2);
			double num2 = icalculator.multiply(input1, input2);
			return (num1 + num2);
		}

}
