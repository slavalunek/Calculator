import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseTest{

    @DataProvider(name = "Data provider for tests sum")
    public Object[][] sumTest(){
       return new Object[][]{
               {3,1,2},
               {3,-1,4},
               {-3,-1,-2},
               {-3,0,-3}
        };
    }

    @Test(dataProvider = "Data provider for tests sum")
    public void validSubtraction(int a, int b, int result){
        Assert.assertEquals(calculator.subtraction(a, b), result, error);
    }
}
