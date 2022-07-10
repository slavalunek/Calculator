import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest{

    @Test(description = "Entering valid numbers for multiplication")
    public void validMultiplication(){
        Assert.assertEquals(calculator.multiplication(3, 1), 3, error);
    }

    @Parameters({"a","b"})
    @Test
    public void validMultiplicationWithNegativeNumber(int a,int b){
        Assert.assertEquals(calculator.multiplication(a, b), -3, error);
    }

    @Test
    public void validMultiplicationWithNegativeNumbers(){
        Assert.assertEquals(calculator.multiplication(-3, -1), 3, error);
    }

    @Test
    public void validMultiplicationWithZero(){
        Assert.assertEquals(calculator.multiplication(3, 0), 0, error);
    }
}
