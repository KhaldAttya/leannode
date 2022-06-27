package com.leannode.enums;

public enum GamingFrequency {
    OneTwoHours("1-2 hours"),
    FourSixHours("4-6 hours"),
    PlusEightHours("+8 hours");

    private final String name;

    GamingFrequency(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
