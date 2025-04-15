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
    }


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

    /*Task 4-Annette Nyirenda, */

    public class task4{
        //public static void main(String[] args) {
            //System.out.println(toCalculate(List.of(20, 22, 18, 35, 48, 26, 87, 70),List.of(2, 4, 8, 1, 2, 3, 87, 70)));

        //}
        public static List<Integer> toCalculate(List <Integer> a, List <Integer> b){

        if (a.size() != b.size()){ 
                return null;
            }
                List<Integer> result = new ArrayList<>();
                for (int i = 0; i < a.size(); i++) {
                result.add( a.get(i) * b.get(b.size() -1-i));
            }
            return result;
        }
    }

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





