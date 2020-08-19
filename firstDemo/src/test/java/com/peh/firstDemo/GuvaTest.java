package com.peh.firstDemo;

import org.junit.Test;

public class GuvaTest {
    @Test
    public void test(){
        int temp = 0;
        int temp1 = 0;
        for(int i = 0;i<10;i++) {
            if (i < 5){
                temp1 = temp++ + 1;
            }
        }
        System.out.println(temp);
        System.out.println(temp1);
    }
}
