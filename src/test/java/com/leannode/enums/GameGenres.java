package com.leannode.enums;

public enum GameGenres {
    Horror("Horror"),
    Adventure("Adventure"),
    Action("Action"),
    FirstPersonShooter("First person shooter"),
    Other("Other (write genres)");

    private final String name;

    GameGenres(String string) {
        name = string;
    }

    public String toString() {
        return this.name;
    }
}
