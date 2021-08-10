package unitesting.unit1;

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import org.junit.Test;


public class CalculatorWithHamcrestMatcher {
		private Calculator calculator;
		private String color = "red";
	
		@Before
		public void setup() {
			calculator = new Calculator(0.0d);
		}
		
		
		@Test
		public void testAddFuncWithZeroNumber() {
			calculator.add(0);
			assertThat(0.0, equalTo(calculator.getValue()));
		}
		
		@Test
		public void testAddFuncWithPositiveNumber() {
			calculator.add(15.0);
			assertThat(15.0, equalTo(calculator.getValue()));
		}
		
		@Test
		public void testAddFuncWithNegativeNumber() {
			calculator.add(-15.0);
			assertThat(-15.0, equalTo(calculator.getValue()));
		}
		
		//Hamcrest Matchers support more assert option
		@Test
		public void assertThatFunctionIs() {
			assertThat(color,is("red"));
		}
		
		@Test
		public void assertThatFunctionNot() {
			assertThat(color,not("green"));
		}
		
		@Test
		public void assertThatFunctionIsOneOf() {
			assertThat(color,isOneOf("green", "blue", "red"));
		}

		@Test
		public void assertThatFunctionIsNull() {
			String empty = null;
			assertThat(empty,is(nullValue()));
		}
		
		@Test
		public void assertThatFunctionListHasItem() {
			List<String> colors = new ArrayList<String>();
			colors.add("red");
			colors.add("blue");
			colors.add("green");
			assertThat(colors,hasItem("blue"));
		}
		
		@Test
		public void assertThatFunctionListHasItems() {
			List<String> colors = new ArrayList<String>();
			colors.add("red");
			colors.add("blue");
			colors.add("green");
			assertThat(colors,hasItems("red","blue"));
		}
		
		@Test
		public void assertThatFunctionListHasItemLessThan() {
			List<Integer> numbers = new ArrayList<Integer>();
			numbers.add(50);
			numbers.add(60);
			numbers.add(70);
			assertThat(numbers,not(hasItems(lessThan(18))));
		}
}
