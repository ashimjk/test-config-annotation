package com.ashimjk.testconfigannotation.beans;

public class DefinedInTestConfig {

    private final String value;

    public DefinedInTestConfig(String value) {
        this.value = value;
    }

    public void print() {
        System.out.println("DefinedInTestConfig : " + value);
    }

}
