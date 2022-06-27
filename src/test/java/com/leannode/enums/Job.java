package com.leannode.enums;

public enum Job {
    Student("I am a student"),
    None("I don’t work"),
    PartTime("I work part time"),
    FullTime("I work full time"),
    BusinessOwner("I am a business owner");

    private final String name;

    Job(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
