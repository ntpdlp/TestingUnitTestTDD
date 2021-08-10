package unitesting.unit1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value = {CalculatorUnitTest.class, CalculatorWithHamcrestMatcher.class})
public class CalculatorTestSuite {

}
