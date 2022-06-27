package com.leannode.enums;

public enum Gender {
    Male("Male"),
    Female("Female");

    private final String name;

    Gender(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
