package com.pepemalpica.factory;

public class PokemonFactory {

    public Pokemon getPokemon(String type) {

        switch (type) {
            case "PIC":
                return new Picachu();
            case "BOL":
                return new Bolbasaur();
            case "CHA":
                return new Charmander();
        }
        return null;
    }

}
