package com.pepemalpica.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvPokemon1, tvPokemon2, tvPokemon3;
    TextView tvMovie1, tvMovie2, tvMovie3;
    TextView tvUser1, tvUser2, tvUser3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Conectar con el XML
        tvPokemon1 = findViewById(R.id.tv_pokemon_1);
        tvPokemon2 = findViewById(R.id.tv_pokemon_2);
        tvPokemon3 = findViewById(R.id.tv_pokemon_3);
        tvMovie1 = findViewById(R.id.tv_movie_1);
        tvMovie2 = findViewById(R.id.tv_movie_2);
        tvMovie3 = findViewById(R.id.tv_movie_3);
        tvUser1 = findViewById(R.id.tv_user_1);
        tvUser2 = findViewById(R.id.tv_user_2);
        tvUser3 = findViewById(R.id.tv_user_3);

        this.getPokemons();
        this.getMovies();
        this.getUsers();

    }

    private void getUsers() {
        UserFactory myUserFactory = new UserFactory();
        User administrator = myUserFactory.getUser("ADM");
        User cms = myUserFactory.getUser("CMS");
        User teacher = myUserFactory.getUser("TEA");
        tvUser1.setText(new StringBuilder()
                .append("Nombre: ")
                .append(administrator.role())
                .append(", descripción: ")
                .append(administrator.description())
        );
        tvUser2.setText(new StringBuilder()
                .append("Nombre: ")
                .append(cms.role())
                .append(", descripción: ")
                .append(cms.description())
        );
        tvUser3.setText(new StringBuilder()
                .append("Nombre: ")
                .append(teacher.role())
                .append(", descripción: ")
                .append(teacher.description())
        );
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

    private void getMovies(){
        MovieFactory myMovieFactory = new MovieFactory();
        Movie deadpoool = myMovieFactory.getMovie("DEA");
        Movie avenders = myMovieFactory.getMovie("AVE");
        Movie dumbo = myMovieFactory.getMovie("DUM");
        tvMovie1.setText(new StringBuilder()
                .append("Nombre: ")
                .append(deadpoool.name())
                .append(", duration: ")
                .append(deadpoool.duration())
        );
        tvMovie2.setText(new StringBuilder()
                .append("Nombre: ")
                .append(avenders.name())
                .append(", duration: ")
                .append(avenders.duration())
        );
        tvMovie3.setText(new StringBuilder()
                .append("Nombre: ")
                .append(dumbo.name())
                .append(", duration: ")
                .append(dumbo.duration())
        );


    }

}
