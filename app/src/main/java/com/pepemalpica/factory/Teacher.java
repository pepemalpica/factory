package com.pepemalpica.factory;

public class Teacher implements User{

    @Override
    public String role() {
        return "Maestro";
    }

    @Override
    public String description() {
        return "Usr tipo maestro";
    }
}
