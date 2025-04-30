import org.example.ArithmeticOperations;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class Test {
    @DisplayName("Факториал")
    @org.junit.jupiter.api.Test
    void testFactorial() {
        Assertions.assertEquals(120, Main.factorial(5));
    }

    @DisplayName("Площадь треугольника")
    @org.junit.jupiter.api.Test
    void testSquare() {
        Assertions.assertEquals(6, Main.squareTriangle(4, 3, 5));
    }

    @DisplayName("Арифметические операции")
    @org.junit.jupiter.api.Test
    void testArithmeticOperations() {
        Assertions.assertEquals(6, ArithmeticOperations.sum(4, 2));
        Assertions.assertEquals(2, ArithmeticOperations.subtraction(4, 2));
        Assertions.assertEquals(8, ArithmeticOperations.multiplication(4, 2));
        Assertions.assertEquals(2, ArithmeticOperations.division(4, 2));
    }

    @DisplayName("Арифметические операции")
    @org.junit.jupiter.api.Test
    void testСomparison() {
        Assertions.assertEquals(">", Main.comparison(4, 3));
        Assertions.assertEquals("<", Main.comparison(3, 4));
        Assertions.assertEquals("=", Main.comparison(4, 4));
    }
}

