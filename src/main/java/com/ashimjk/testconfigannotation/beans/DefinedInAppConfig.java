package com.ashimjk.testconfigannotation.beans;

public class DefinedInAppConfig {

    private final String value;

    public DefinedInAppConfig(String value) {
        this.value = value;
    }

    public void print() {
        System.out.println("DefinedInAppConfig : " + value);
    }

}
