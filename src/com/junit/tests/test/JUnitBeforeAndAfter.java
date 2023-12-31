package com.junit.tests.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitBeforeAndAfter {
    @Test
    public void verifyUserCanLoginIntoTheApp(){
        System.out.println("==========1==========");
    }
    @Test
    public void verifyUserCannotLoginWithInvalidCred(){
        System.out.println("==========Test 2==========");
    }
    @Test
    public void verifyUserCanLogout(){
        System.out.println("==========Test 3==========");
    }
    @Before
    public void setUp(){
        System.out.println("==========Before==========");
    }
    @After
    public void cleanUp(){
        System.out.println("==========After==========");
    }
}
