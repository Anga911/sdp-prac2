/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class AppTest {

    /*
     Anga: Test case for Task 2
     */

    @Test
    public void testTask2(){

        List<String> test = Arrays.asList("No", "Yes", "GG", "Maybe", "", "L");
        List<String> outcome = Arrays.asList("o", "es", "G", "aybe", "");

        List<String> test2 = Arrays.asList("Apple", "Banana", "Grapes", "Kiwi", "Tomato");
        List<String> outcome2 = Arrays.asList("pple", "anana", "rapes", "iwi", "omato");

        assertEquals(outcome, SimpleFunctions.Task2(test));
        assertEquals(outcome2, SimpleFunctions.Task2(test2));

    }


    @Test //Test for task1 by Karabo 
        void testTask1(){
         List<Integer> a = List.of(7, 42, 19, 3, 88, 21, 56, 14, 67, 30);
     
         List<Integer> b = List.of(3, 12, 7, 3, 45, 8, 19, 2, 27, 3);
     
         List<Integer> c = List.of();
         List<Integer> d = List.of();
     
     
         List<Integer> e = List.of(10, 20, 30, 40, 50);
         List<Integer> f = List.of(0, 4, -1, 2, 10, 2, 0);
     
         assertEquals(109,SimpleFunctions.Task1(a, b), "failed should be 109");
         assertEquals(0,SimpleFunctions.Task1(c, d), "failed should be 0");
         assertEquals(130,SimpleFunctions.Task1(e, f), "failed should be 130");
     
     
        }

   /*Task 3 unit tests using Arrange-Act-Assert*/
   //Test if balanced parentheses returns True
   @Test
   void testTask3() {
     
      String input1 = "(())()";
      boolean result1 = Task3(input);

      String input2 = "(()))(";
      boolean result2 = Task3(input);

      
      assertTrue(result1, "Expected balanced parentheses to return true");
      assertFalse(result2, "Expected unbalanced parentheses to return false");
   }

   //Test if unbalanced parentheses returns False
 
      
     
      



}
