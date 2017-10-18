import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

        @Before
    public void setUp() throws Exception {
    }

        @Test
        public void test() {
                //      Test for each case
                int threeTestCase = 3;
                int fiveTestCase = 5;
                int bothTestCase = 15;
                int neitherTestCase = 7;
                String fizz = "Fizz\n";
                String buzz = "Buzz\n";
                String fizzbuzz = "FizzBuzz\n";
                String neither = Integer.toString(neitherTestCase) + "\n";
                //      Here we test all the cases
                assertTrue(fizz.equals(returnResult(threeTestCase)));
                assertTrue(buzz.equals(returnResult(fiveTestCase)));
                assertTrue(fizzbuzz.equals(returnResult(bothTestCase)));
                assertTrue(neither.equals(returnResult(neitherTestCase)));

        }

        public static String returnResult(int i){
                //      If the number is divisible by 3 and 5...
                if(i%3==0 && i%5==0){
                        String fizzbuzz = "FizzBuzz\n";
                        return fizzbuzz;
                }
                //      Else if the number is only divisible by 3, print Fizz
                else if(i%3==0){
                        String fizz = "Fizz\n";
                        return fizz;
                }
                //      Else if the number is only divisible by 5, print Buzz
                else if(i%5==0){
                        String buzz = ("Buzz\n");
                        return buzz;
                }
                //      Otherwise print the number
                else{
                        String passedNum = Integer.toString(i) + "\n";
                        return passedNum;
                }
        }

}
