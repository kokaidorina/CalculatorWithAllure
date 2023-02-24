import io.qameta.allure.*;
import org.example.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @Story("User story 2")
    @Description("Description related to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag 2")
    public void testAdd(){
        Calculator calc=new Calculator();
        Assertions.assertEquals(7, calc.add(4,3));
    }

    private Calculator createCalc(){
        return new Calculator();
    }


    @Story("User story 2")
    @Description("Description related to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag 1")
    @Test
    public void testAddWithNeg(){
        Calculator calc=new Calculator();
        Assertions.assertEquals(-7, calc.add(-2,-3));
    }
}
