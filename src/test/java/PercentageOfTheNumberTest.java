import org.testng.Assert;
import org.testng.annotations.Test;

public class PercentageOfTheNumberTest extends BaseTest{

    @Test
    public void validPercentageOfTheNumber(){
        Assert.assertEquals(calculator.percentageOfTheNumber(100,10), 10, error);
    }

    @Test
    public void validPercentageOfTheNegativeNumber(){
        Assert.assertEquals(calculator.percentageOfTheNumber(-100,10), -10, error);
    }

    @Test
    public void validPercentageOfTheZero(){
        Assert.assertEquals(calculator.percentageOfTheNumber(10,0), 0, error);
    }
}
