package com.herokuapp.thinternet.base;

public class TestUtilities extends BaseTest {

    //static sleep
    protected void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
