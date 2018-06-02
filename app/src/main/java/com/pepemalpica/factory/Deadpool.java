package com.pepemalpica.factory;

public class Deadpool implements Movie{
    @Override
    public String name() {
        return "Deadpool";
    }

    @Override
    public String duration() {
        return "2:15:00";
    }
}
