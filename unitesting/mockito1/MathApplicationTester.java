package unitesting.mockito1;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	   @InjectMocks 
	   MathApplication mathApplication = new MathApplication();

	   @Mock
	   ICalculator calcService;

	   @Test
	   public void testComplexOperatorwithPositiveNumber(){
	      //add the behavior
	      when(calcService.add(10.0,20.0)).thenReturn(30.0);
	      when(calcService.multiply(10.0,20.0)).thenReturn(200.0);
			
	      //test your real function
	      Assert.assertEquals(mathApplication.complexOperation(10.0, 20.0),230.0,0);
	   }
}
