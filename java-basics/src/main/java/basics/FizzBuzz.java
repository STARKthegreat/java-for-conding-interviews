package basics;


/*
 * 
    1. Implement FizzBuzz Logic:
    Create a Java program that prints numbers from 1 to 100.
    For multiples of 3, print "Fizz" instead of the number.
    For multiples of 5, print "Buzz" instead of the number.
    For numbers which are multiples of both 3 and 5, print "FizzBuzz."
    Example: From 1 to 15: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz

    2. Unit Tests:
    Write JUnit tests to verify the correctness of your FizzBuzz logic.
    Include test cases covering multiples of 3, multiples of 5, and multiples of both 3 and 5.
    Ensure the tests cover the entire range of numbers from 1 to 100.
 */
public class FizzBuzz {
    

    public static String fizzBuzzSolution(int n){
    String output = "";
    for(int i = 0; i <= n; i++){ 
        if(i % 3 ==0 && i % 5 == 0){
            output += "Fizz Buzz";
        }else if( i % 5 == 0){
            output = "Buzz";
        }else if( i % 3 == 0) {
            output += "Fizz";
        } {
            output += " " + i;
        }   
    }
    return output;

    }
}
