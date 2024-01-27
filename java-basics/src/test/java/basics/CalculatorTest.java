package basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest{

    @Test
    public void testAdd(){
        assertEquals(5, Calculator.add(2,3));
    }

    @ParameterizedTest
    @MethodSource("basics.DataProvider#dataProviderForAdd")
    public void parameterizedAddTest(int a, int b, int expected){
        assertEquals(expected, Calculator.add(a, b));
    }
}