package com.rewardspoints;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rewardspoints.util.Util;

public class UtilTest {

    @Test
    public void concatWordsMultipleArgumentsSuccessTest(){
        Assertions.assertEquals("ThisisanTest",Util.concatWords("This","is","an","Test"));
    }

    @Test
    public void concatWordsNoArgumentsSuccessTest(){
        Assertions.assertEquals("",Util.concatWords());
    }

    @Test
    public void concatWordsArrayArgumentsSuccessTest(){
        String[] strs = {"This","is","an","Test"};
        Assertions.assertEquals("ThisisanTest",Util.concatWords(strs));
    }

    @Test
    public void concatWordsNullArgumentFailureTest(){
        Assertions.assertThrows(NullPointerException.class,()->Util.concatWords(null));
    }


    @Test
    public void computeFactorialNumberArgSuccessTest(){
        Assertions.assertEquals("120",Util.computeFactorial(5));
    }
    @Test
    public void computeFactorialOneAsNumberArgSuccessTest(){
        Assertions.assertEquals("1",Util.computeFactorial(1));
    }


    @Test
    public void computeFactorialZeroAsInputFailureTest(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Util.computeFactorial(0));
    }

    @Test
    public void computeFactorialNegativeInputFailureTest(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Util.computeFactorial(-5));
    }
}
