import org.example.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerTest extends BaseTest{

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void validMultiplicationWithNegativeNumbers(){
        Assert.assertNotEquals(calculator.multiplication(-3, -1), 3, error);
    }
}
