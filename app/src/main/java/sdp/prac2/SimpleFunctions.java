package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

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
    }
}
