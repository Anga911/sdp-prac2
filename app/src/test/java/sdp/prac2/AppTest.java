/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

class AppTest {
   @Test
  

   void testTask1(){
    List<Integer> a = List.of(7, 42, 19, 3, 88, 21, 56, 14, 67, 30);

    List<Integer> b = List.of(3, 12, 7, 3, 45, 8, 19, 2, 27, 3);

    assertEquals(109,SimpleFunctions.Task1(a, b), "failed should be 109");


   }

   /*Task 3 unit tests using Arrange-Act-Assert*/
   //Test if balanced parentheses returns True
   @Test
   void task3test1() {
      // Arrange
      String input = "(())()";

      // Act
      boolean result = Task3(input);

      // Assert
      assertTrue(result, "Expected balanced parentheses to return true");
   }

   //Test if unbalanced parentheses returns False
   @Test
   void task3test2() {
      // Arrange
      String input = "(()))(";

      // Act
      boolean result = Task3(input);

      // Assert
      assertFalse(result, "Expected unbalanced parentheses to return false");
   }


}
