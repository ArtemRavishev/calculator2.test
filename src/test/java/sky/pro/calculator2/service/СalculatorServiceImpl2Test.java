package sky.pro.calculator2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sky.pro.calculator2.exeptions.DivByZeroExeption;

public class СalculatorServiceImpl2Test {

    private final СalculatorServiceImpl2 сalculatorServiceImpl2 = new СalculatorServiceImpl2();


    @Test
    public void plusTest() {
        Number actual = сalculatorServiceImpl2.plus(1,2);
        Number expected = 3;

        Assertions.assertEquals(expected,actual);

         actual = сalculatorServiceImpl2.plus(-1,2);
         expected = 1;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void minusTest() {
        Number actual = сalculatorServiceImpl2.minus(1,2);
        Number expected = -1;

        Assertions.assertEquals(expected,actual);

        actual = сalculatorServiceImpl2.minus(-1,2);
        expected = -3;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void multiplyTest() {
        Number actual = сalculatorServiceImpl2.multiply(1,2);
        Number expected = 2;

        Assertions.assertEquals(expected,actual);

        actual = сalculatorServiceImpl2.multiply(-1,2);
        expected = -2;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void divideTest() {
        Number actual = сalculatorServiceImpl2.divide(4,2);
        Number expected = 2;

        Assertions.assertEquals(expected,actual);

        actual = сalculatorServiceImpl2.divide(-4,2);
        expected = -2;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void divideNegativTest() {
        Assertions.assertThrows(DivByZeroExeption.class,()->сalculatorServiceImpl2.divide(1,0));
        Assertions.assertThrows(DivByZeroExeption.class,()->сalculatorServiceImpl2.divide(-1,0));
    }
}
