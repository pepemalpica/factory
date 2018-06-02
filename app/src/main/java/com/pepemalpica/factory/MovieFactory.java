package com.pepemalpica.factory;

public class MovieFactory {

    public Movie getMovie(String type){
        switch (type){
            case "DEA":
                return new Deadpool();
            case "AVE":
                return new Avengers();
            case "DUM":
                return new Dumbo();
        }
        return null;
    }
}
