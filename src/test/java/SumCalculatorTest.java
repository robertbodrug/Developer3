import logic.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class SumCalculatorTest {
    private SumCalculator calc;
    @BeforeEach
    public void beforeEach() {
         calc = new SumCalculator();
    }

    @Test
    void testThatSum1() {
        //When
        int actual;
        actual = calc .sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSum3() {
        //When
        int actual = calc.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    void test(){
        calc.sum(0);
    }
    @Test
    void testThatSumExceptionCorrect() {

        Assertions.assertThrows(IllegalArgumentException.class,this::test);
    }


}
