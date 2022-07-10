import org.example.Calculator;
import org.testng.annotations.*;

public class BaseTest {

    Calculator calculator;
    String error = "not the correct result";

    @BeforeSuite
    public void beforeExample() {
        System.out.println("BaseTest.@BeforeSuite");
    }

    @BeforeMethod(groups = {"negative test"})
    public void setUp() {
        calculator = new Calculator();
    }

    @BeforeClass
    public void beforeExample1() {
        System.out.println("PercentageOfTheNumber.@BeforeClass");
    }

    @BeforeGroups(groups = "negative test")
    public void beforeExample2(){
        System.out.println("Exponentiation.@BeforeGroups");
    }
}