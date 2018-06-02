package com.pepemalpica.factory;

public class Picachu implements Pokemon{

    @Override
    public String name() {
        return "Picachu";
    }

    @Override
    public int power() {
        return 140;
    }
}
