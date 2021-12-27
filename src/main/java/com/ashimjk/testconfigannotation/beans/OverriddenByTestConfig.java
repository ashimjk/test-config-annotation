package com.ashimjk.testconfigannotation.beans;

public class OverriddenByTestConfig {

    private final String value;

    public OverriddenByTestConfig(String value) {
        this.value = value;
    }

    public void print() {
        System.out.println("OverriddenByTestConfig : " + value);
    }

}
