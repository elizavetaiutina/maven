import jdk.jfr.Description;
import org.example.ArithmeticOperations;
import org.example.Main;
import org.testng.Assert;

public class Test {

    @org.testng.annotations.Test
    public void testFactorial() {
        Assert.assertEquals(Main.factorial(5), 120);
    }

    @org.testng.annotations.Test
    public void testSquare() {
        Assert.assertEquals(Main.squareTriangle(4, 3, 5), 6);
    }

    @org.testng.annotations.Test
    public void testArithmeticOperations() {
        Assert.assertEquals(ArithmeticOperations.sum(4, 2), 6);
        Assert.assertEquals(ArithmeticOperations.subtraction(4, 2), 2);
        Assert.assertEquals(ArithmeticOperations.multiplication(4, 2), 8);
        Assert.assertEquals(ArithmeticOperations.division(4, 2), 2);
    }

    @org.testng.annotations.Test
    public void testСomparison() {
        Assert.assertEquals(Main.comparison(4, 3), ">");
        Assert.assertEquals(Main.comparison(3, 4), "<");
        Assert.assertEquals(Main.comparison(4, 4), "=");
    }
}
