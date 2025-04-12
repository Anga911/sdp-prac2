package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {};


    /* Task6, which rounds up each number in the provided integer list to the next-highest multiple of 100. 
    If a number is already a multiple of 100, it is left unchanged. 
    Do not modify the list that is passed; instead, return a new list.
    param lst: the original Integer List
    
    Intialises newLst as original List can not be modified
    uses a for loop to iterate through orginal list.
    uses ceiling function to round up numbers divided by 100.0 to prevent integer division
    Once the decimals are rounded up it is multiplied by 100 to get proper number
    
     * 
     */
    public List<Integer> listRoundUp(List<Integer> lst){ //task 6 By Karabo Ntsie!
        List<Integer> newLst = new ArrayList<Integer>();

        for(Integer num: lst){
            Integer roundedUp = (int) Math.ceil(num/100.0)*100;
            newLst.add(roundedUp);
        }

        return newLst;
    }
}
