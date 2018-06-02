package com.pepemalpica.factory;

public class Admin implements User{

    @Override
    public String role() {
        return "Administrador";
    }

    @Override
    public String description() {
        return "Tiene acceso a todo el sistem";
    }
}
