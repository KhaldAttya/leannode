package com.leannode.enums;

public enum TechLevel {
    Advance("Advance, I work in tech field"),
    Good("Good, I am someone that my family/friends refer to when struggling with a platform"),
    Medium("Medium, I am good but I sometimes i need help here and there"),
    Basic("Basic, I usually need help with most platforms/applications"),
    None("None, I only use my phone to call or text");

    private final String name;

    TechLevel(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
