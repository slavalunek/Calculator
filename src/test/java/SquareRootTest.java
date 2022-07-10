import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareRootTest extends BaseTest{

    @Test
    public void validSquareRoot(){
        Assert.assertEquals(calculator.squareRoot(9), 3, error);
    }

    @Test(groups = "negative test",expectedExceptions = IllegalArgumentException.class)
    public void invalidSquareRootWithNegativeNumber(){
        Assert.assertEquals(calculator.squareRoot(-9), "", error);
    }

    @Test
    public void validSquareRootWithZero(){
        Assert.assertEquals(calculator.squareRoot(0), 0, error);
    }
}
