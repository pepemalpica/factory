package com.pepemalpica.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvPokemon1, tvPokemon2, tvPokemon3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Conectar con el XML
        tvPokemon1 = findViewById(R.id.tv_pokemon_1);
        tvPokemon2 = findViewById(R.id.tv_pokemon_2);
        tvPokemon3 = findViewById(R.id.tv_pokemon_3);

        this.getPokemons();

    }

    private void getPokemons(){

        PokemonFactory myPokemonFactory = new PokemonFactory();
        Pokemon picachu = myPokemonFactory.getPokemon("PIC");
        Pokemon bolbasaur = myPokemonFactory.getPokemon("BOL");
        Pokemon charmander = myPokemonFactory.getPokemon("CHA");
        tvPokemon1.setText(new StringBuilder()
                .append("Nombre: ")
                .append(picachu.name())
                .append(", power: ")
                .append(picachu.power())
        );
        tvPokemon2.setText(new StringBuilder()
                .append("Nombre: ")
                .append(bolbasaur.name())
                .append(", power: ")
                .append(bolbasaur.power())
        );
        tvPokemon3.setText(new StringBuilder()
                .append("Nombre: ")
                .append(charmander.name())
                .append(", power: ")
                .append(charmander.power())
        );

    }



}
