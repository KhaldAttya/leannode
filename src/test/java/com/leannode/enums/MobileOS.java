package com.leannode.enums;

public enum MobileOS {
    iOS("iOS"),
    Android("Android"),
    Others("Others");


    private final String name;

    MobileOS(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
