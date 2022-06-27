package com.leannode.enums;

public enum EducationMajor {
    IT("IT"),
    BusinessAdministration("Business administration (Marketing, accounting…)"),
    Engineering("Engineering"),
    Medical("Medical"),
    Other("Other");

    private final String name;

    EducationMajor(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
