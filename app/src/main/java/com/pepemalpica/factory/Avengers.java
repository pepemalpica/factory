package com.pepemalpica.factory;

public class Avengers implements Movie{
    @Override
    public String name() {
        return "Avengers";
    }

    @Override
    public String duration() {
        return "1:40:10";
    }
}
