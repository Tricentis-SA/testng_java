import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sample.intercls.ICalculator;
import utils.Calculator;

/**
 * Created by duongnapham on 4/22/15.
 */
public class CalculatorTest {

    private static ICalculator calculator;

    @BeforeClass
    public static void initCalculator() {
        calculator = new Calculator();
    }

    @BeforeTest (enabled = false)
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }

    @AfterTest (enabled = false)
    public void afterEachTest() {
        System.out.println("This is executed after each Test");
    }

    @Test
    public void testSum() {
        System.out.println("----- START OF Verify function testSum in CalculatorTest class -------------");
        int result = calculator.sum(3, 9);

        Assert.assertEquals(12, result);
        System.out.println("----- END OF Verify function testSum in CalculatorTest class -------------");
    }

    @Test
    public void testDivison() {
        System.out.println("----- START OF Verify function testDivison in testDivison class -------------");
        try {
            int result = calculator.divison(10, 2);

            Assert.assertEquals(5, result);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        System.out.println("----- END OF Verify function testDivison in testDivison class -------------");
    }

    @Test (enabled = false)
    public void testDivisionException() throws Exception {
        System.out.println("----- START OF Verify function testDivisionException in testDivisionException class -------------");
        calculator.divison(10, 0);
        System.out.println("----- END OF Verify function testDivisionException in testDivisionException class -------------");
    }

    @Test
    public void testEqual() {
        boolean result = calculator.equalIntegers(20, 20);

        Assert.assertTrue(result);
    }

    @Test
    public void testSubstraction() {
        int result = 10 - 3;

        Assert.assertTrue(result == 6);
    }

}
