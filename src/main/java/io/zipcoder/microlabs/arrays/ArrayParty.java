package io.zipcoder.microlabs.arrays;
import java.util.*;


public class ArrayParty {
    public ArrayParty(){

    }
    String output = "*** Output ***\n";
    public String printArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (i != inputArray.length - 1) {
                output += inputArray[i] + "\n";
            } else {
                output += inputArray[i];
            }
        }
        return output;
    }

    public String lastElement(String[] inputArray){
        String lastElement = inputArray[inputArray.length-1];
        return lastElement;
    }

    //TODO Define the method lastButOne
    public String lastButOne(String[] inputArray){
        String lastButOne = inputArray[inputArray.length-2];
        return lastButOne;
    }

    //TODO Define the method reverse
    public String reverse(String[] inputArray){
        for(int i= inputArray.length-1; i>=0;i--){
            output += inputArray[i]+"\n";
        }
        return output;
    }

    //TODO Define the method isPalindrome
    public boolean isPalindrome(String[] inputArray){
        for(int i = 0; i< inputArray.length/2; i++) {
            if (inputArray[i] != inputArray[inputArray.length - (i + 1)]) return false;
        }
        return true;
    }
//    public String isPalindrome2(String[] inputArray){
//        for(int i = 0; i< inputArray.length/2; i++) {
//            if (inputArray[i] != inputArray[inputArray.length - (i + 1)])
//                output += inputArray[i];
//        }
//    return output;
//    }

    //TODO Define the method compress
    public String compress(int[] inputArray){
        output = "compress(nums)\n*** Output ***\n"+inputArray[0]+"\n";
        //print an array to eliminate consecutive duplicates
        for(int i=1; i<inputArray.length;i++){
            if(inputArray[i]!=inputArray[i-1]){
                output += inputArray[i]+"\n";
            }
        }
        return output;
    }

    //TODO Define the method pack
    public String pack(char[] inputArray){
        String output = "pack(letters)\n*** Output ***\n"+inputArray[0];
        for(int i=0;i<inputArray.length-1;i++ ){
            if(inputArray[i]==inputArray[i+1]){
                output += inputArray[i+1];
            }
            else{
                output += ", "+inputArray[i+1];
            }
        }
        return output;

    }


}
