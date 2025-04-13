package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    /*
    Anga: Task 1 
    Below is a method which accepts lists of 
    integers a and b, and adds up the elements 
    from a whose indexes are specified by b.  
    If any index in b is out-of-range for a, that index is ignored :) 
    */

    public static int Task1(int[] a, int[] b){

        int acc = 0;

        for (int i = 0; i < b.length; i++){
            
            if (b[i] < 0 || b[i] >= a.length){
                continue;
            }else{
                acc += a[b[i]];
            }
        }
        return acc;
    }
}


