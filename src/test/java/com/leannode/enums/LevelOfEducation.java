package com.leannode.enums;

public enum LevelOfEducation {
    HighSchool("High school and bellow"),
    Diploma("Diploma"),
    Bachelor("Bachelor"),
    Masters("Masters"),
    PHD("PHD");

    private final String name;

    LevelOfEducation(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
