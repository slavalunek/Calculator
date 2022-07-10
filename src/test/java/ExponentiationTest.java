import org.testng.Assert;
import org.testng.annotations.Test;

public class ExponentiationTest extends BaseTest{

    @Test
    public void validExponentiation(){
        Assert.assertEquals(calculator.exponentiation(3, 2), 9, error);
    }

    @Test
    public void validExponentiationWithNegativeNumber(){
        Assert.assertEquals(calculator.exponentiation(-6, 2), 36, error);
    }

    @Test
    public void validExponentiationWithNegativeDegree(){
        Assert.assertEquals(calculator.exponentiation(2, -2), 0.25, error);
    }

    @Test
    public void validExponentiationWithZero(){
        Assert.assertEquals(calculator.exponentiation(3, 0), 1, error);
    }
}
