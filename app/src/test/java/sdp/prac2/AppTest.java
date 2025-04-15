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

}
