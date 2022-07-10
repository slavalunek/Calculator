import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest{

    @BeforeTest
    public void beforeExample3(){
        System.out.println("Exponentiation.@BeforeTest");
    }

    @Test(priority = 0,invocationCount = 3,threadPoolSize = 2)
    public void validDivision(){
        Assert.assertEquals(calculator.division(3, 1), 3, error);
    }

    @Test(priority = 2)
    public void validDivisionWithNegativeNumber(){
        Assert.assertEquals(calculator.division(6, -2), -3, error);
    }

    @Test(priority = 1)
    public void validDivisionWithNegativeNumbers(){
        Assert.assertEquals(calculator.division(-3, -1), 3, error);
    }

    @Test(groups = "negative test", expectedExceptions = IllegalArgumentException.class)
    public void invalidDivisionWithZero(){
        Assert.assertEquals(calculator.division(3, 0), "", error);
    }

//    @Test
//    public void invalidDivision(){
//        Assert.assertNotEquals(calculator.division(5, 2), 8, error);
//    }
}
