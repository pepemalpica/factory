package com.pepemalpica.factory;

public class UserFactory {

    public User getUser(String type){
        switch (type){
            case "ADM":
                return new Admin();
            case "CMS":
                return new Cms();
            case "TEA":
                return new Teacher();
        }
        return null;
    }

}
