package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

<<<<<<< HEAD
    /*
    Anga: Task 1 
    Below is a method which accepts lists of 
    integers a and b, and adds up the elements 
    from a whose indexes are specified by b.  
    If any index in b is out-of-range for a, that index is ignored :) 
    */

    public static int Task1( List<Integer> a,  List<Integer> b){

        int acc = 0;

        for (int i = 0; i < b.size(); i++){
            
            if (b.get(i) < 0 || b.get(i) >= a.size()){
                continue;
            }else{
                acc += a.get(b.get(i));
            }
        }
        return acc;
=======
    /*Task2 written by Anesipho
    This method removes the first character from every element in a list
    and returns the modified list*/ 
    public static List<String> Task2(List<String> aList){
        List<String> output = new ArrayList<>();

        for (String str : aList){
            if (str.length() > 1){
                output.add(str.substring(1));
            } else if (str.length() == 1){
                continue;
            }
        }
        return output;
>>>>>>> task2_g23n7615
    }
}


