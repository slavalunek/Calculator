import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {

    @Test
    public void validSum() {
        Assert.assertEquals(calculator.sum(1, 3), 4, error);
    }

    @Test
    public void validSumWithANegativeNumber() {
        Assert.assertEquals(calculator.sum(-2, 3), 1, error);
    }

    @Test
    public void validSumWithZero() {
        Assert.assertEquals(calculator.sum(0, 3), 3, error);
    }


}
