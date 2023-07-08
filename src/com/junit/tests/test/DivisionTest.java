package com.junit.tests.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DivisionTest extends BaseTest {
    int expectedResult, a, b;// my instance variables

    //My constructor
    public DivisionTest(int a, int b, int expectedResult){
        this.expectedResult=expectedResult;
        this.a=a;
        this.b=b;
    }

    @Category({SmokeTest.class, ChiragTest.class})
   @Test
    public void verifyFirstNumberIsGreaterThanSecond5(){
       int actualResult=c.div(a,b);
       String message= "expected"+expectedResult+"actual"+actualResult;
       Assert.assertTrue(message, actualResult==expectedResult);
   }
   @Parameterized.Parameters(name= "Running with {0} and expecting {2}")
    public static Integer [][] supplyStuff(){
        Integer stuff[][]= {
                {0, 3, 0},
                {200, 200, 1},
                {1, 1, 1},
                {10, 5, 2},
                {-6, -2, 3},
                {-6, 2, -3},
                {8, -2, -4}
        };
        return stuff;
   }


}
