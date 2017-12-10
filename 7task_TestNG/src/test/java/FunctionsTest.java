import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class FunctionsTest {

    @BeforeClass
    public void before() {
        System.out.println("Before class method");
    }

    @DataProvider(name = "calculatorDataProvider")
    public Object[][] simpleDataProvider() {
        return new Object[][]{
                {2.0, 2.0, 4.0},
                {2.0, -2.0, 0.0},
                {7.0, 8.3, 15.3}
        };
    }

    @Test(dataProvider = "calculatorDataProvider")
    public void checkAddition(double firstParam, double secondParam, double expectedResult) {
        Functions func = new Functions();
        double result = func.addition(firstParam,secondParam);
        assertTrue("Результат(" + result + ") не равен " + expectedResult, result == expectedResult);
    }

    @Test
    public void checkDivision() {
        System.out.println("Second test method");
        Functions func = new Functions();
        double result = func.division(9,3);
        assertTrue("Результат(" + result + ") не равен 3", result == 3.0);
    }

    @AfterClass
    public void after() {
        System.out.println("After class method");
    }
}