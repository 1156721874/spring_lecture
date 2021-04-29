package com.twodragonlake.boot.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/6/7 17:58
 */


public class MyConfigBean {
    @Value("${myConfig.myObject.myName}")
    private  String myName;
    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
}
