package sky.pro.calculator2.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sky.pro.calculator2.exeptions.DivByZeroExeption;

import java.util.stream.Stream;


public class CalculatorServiceParameterizedTest {

    private final СalculatorServiceImpl2 сalculatorServiceImpl2 = new СalculatorServiceImpl2();


    public static Stream<Arguments> plusTestParams() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(-1, 2, 1),
                Arguments.of(0, 0, 0)
        );
    }

    public static Stream<Arguments> minusTestParams() {
        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(-1, 2, -3),
                Arguments.of(0, 0, 0)
        );
    }

    public static Stream<Arguments> multiplyTestParams() {
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(-1, 2,-2),
                Arguments.of(0, 0, 0)
        );
    }

    public static Stream<Arguments> divideTestParams() {
        return Stream.of(
                Arguments.of(4, 4, 1),
                Arguments.of(-3, 3, -1),
                Arguments.of(0, 3, 0)
        );
    }

    public static Stream<Arguments> divideNegativTestParams() {
        return Stream.of(Arguments.of(1, 0),
                Arguments.of(-1, 0));
    }

        @ParameterizedTest
        @MethodSource("plusTestParams")
        public void plusTest ( int a, int b, int expected){
            Assertions.assertThat(сalculatorServiceImpl2.plus(a, b))
                    .isEqualTo(expected);
        }
        @ParameterizedTest
        @MethodSource("minusTestParams")
        public void minusTest ( int a, int b, int expected){
            Assertions.assertThat(сalculatorServiceImpl2.minus(a, b))
                    .isEqualTo(expected);
        }
        @ParameterizedTest
        @MethodSource("multiplyTestParams")
        public void multiplyTest ( int a, int b, int expected){
            Assertions.assertThat(сalculatorServiceImpl2.multiply(a, b))
                    .isEqualTo(expected);
        }
        @ParameterizedTest
        @MethodSource("divideTestParams")
        public void divideTest ( int a, int b, int expected){
            Assertions.assertThat(сalculatorServiceImpl2.divide(a, b))
                    .isEqualTo(expected);
        }
        @ParameterizedTest
        @MethodSource("divideNegativTestParams")
        public void divideNegativTest ( int a, int b){
            Assertions.assertThatExceptionOfType(DivByZeroExeption.class)
                    .isThrownBy(()->сalculatorServiceImpl2.divide(a,b));
        }
    }

