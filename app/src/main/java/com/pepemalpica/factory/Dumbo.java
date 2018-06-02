package com.pepemalpica.factory;

public class Dumbo implements Movie {
    @Override
    public String name() {
        return "Dumbo";
    }

    @Override
    public String duration() {
        return "1:40:03";
    }
}
