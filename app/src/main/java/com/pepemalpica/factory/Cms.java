package com.pepemalpica.factory;

public class Cms implements User{

    @Override
    public String role() {
        return "Content Manager System";
    }

    @Override
    public String description() {
        return "Maneja los contenidos del sistema";
    }
}
