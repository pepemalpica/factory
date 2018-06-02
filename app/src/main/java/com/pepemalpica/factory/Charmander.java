package com.pepemalpica.factory;

public class Charmander implements Pokemon{

    @Override
    public String name() {
        return "Charmander";
    }

    @Override
    public int power() {
        return 152;
    }
}
