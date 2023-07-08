package com.junit.tests.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ModuloTest extends BaseTest {
    @Category({SmokeTest.class, MariaTest.class})
    @Test
    public void verifyWithOneZeroAndOtherzero(){
        int expResult = 4;
        int actResult = c.modulo(9,5);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithNegative10AndPositiveThree(){
        int expResult = 0;
        int actResult = c.modulo(5,1);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndNegativeThree(){
        int expResult = 1;
        int actResult = c.modulo(1,5);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndPositiveZero(){
        int expResult = 0;
        int actResult = c.modulo(-15,-3);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithPositiveThirtyAndPositiveTen(){
        int expResult =-3;
        int actResult = c.modulo(-15,4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen1(){
        int expResult =3;
        int actResult = c.modulo(15,-4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen2(){
        int expResult =0;
        int actResult = c.modulo(0,4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen3(){
        int expResult =0;
        int actResult = c.modulo(15,0);
        Assert.assertEquals(expResult, actResult);
    }
}
