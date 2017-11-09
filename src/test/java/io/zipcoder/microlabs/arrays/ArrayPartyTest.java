package io.zipcoder.microlabs.arrays;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
    ArrayParty arrayParty = new ArrayParty();
    @Test
    public void printArrayTest(){
        //: Given

        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String expected = "Mushrooms";
        //: When
        String actual = arrayParty.lastElement(breakfast);
        //: Then
        Assert.assertEquals("Same",expected,actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneTest(){
        String expected = "Tomatoes";
        String actual = arrayParty.lastButOne(breakfast);
        Assert.assertEquals("Same", expected, actual);
    }

    //TODO Define the method reverseTest
    @Test
    public void reverseTest(){
        String expected = "*** Output ***\n"+
        "Mushrooms\n"+
        "Tomatoes\n"+
        "Bacon\n"+
        "Beans\n"+
        "Eggs\n"+
        "Sausage\n";
        String actual = arrayParty.reverse(breakfast);
        Assert.assertEquals("Same", expected, actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest(){
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        boolean expected = true;
        boolean actual = arrayParty.isPalindrome(palindromic);
        Assert.assertEquals("same", expected, actual);
    }
//    @Test
//    public void isPalindrome2Test(){
//        String [] palindromic = {"Sausage", "Eggs", "Beans",
//                "Beans", "Eggs", "Sausage"};
//        ArrayParty arrayParty = new ArrayParty();
//        String expected = "Sausage Eggs Beans Beans Eggs Sausage";
//        String actual= arrayParty.isPalindrome2(palindromic);
//        Assert.assertEquals("same", expected, actual);
//
//

    //TODO Define the method compressTest
    @Test
    public void compressTest(){
    int[] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
    String expected = "compress(nums)\n*** Output ***\n"+
            "1\n"+
            "3\n"+
            "2\n"+
            "1\n"+
            "4\n";
    String actual = arrayParty.compress(nums);
    Assert.assertEquals("same",expected, actual);

    }
    //TODO Define the method packTest
    @Test
    public void packTest() {
        char[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd',
                'e', 'e', 'e', 'e'};
        String expected = "pack(letters)\n*** Output ***\naaaa, b, cc, aa, d, eeee";
        String actual = arrayParty.pack(letters);
        Assert.assertEquals("same",expected,actual);
    }
}
