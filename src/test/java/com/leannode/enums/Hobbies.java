package com.leannode.enums;

public enum Hobbies {
    Walking("Walking"),
    Gaming("Gaming"),
    Reading("Reading");

    private final String name;

    Hobbies(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
