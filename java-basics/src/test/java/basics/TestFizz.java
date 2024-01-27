package basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFizz {
    @Test
    public void testFizzBuzz(){
        assertEquals("1\r\n" + //
                "2\r\n" + //
                "Fizz\r\n" + //
                "4\r\n" + //
                "Buzz\r\n" + //
                "Fizz\r\n" + //
                "7\r\n" + //
                "8\r\n" + //
                "Fizz\r\n" + //
                "Buzz\r\n" + //
                "11\r\n" + //
                "Fizz\r\n" + //
                "13\r\n" + //
                "14\r\n" + //
                "Fizz Buzz", FizzBuzz.fizzBuzzSolution(15));
    }
}
