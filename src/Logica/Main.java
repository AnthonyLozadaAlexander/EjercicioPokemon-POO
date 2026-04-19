package Logica;

import Logica.Pokemons.Bulbasur;
import Logica.Pokemons.Charmander;
import Logica.Pokemons.Pikachu;
import Logica.Pokemons.Squirtle;

public class Main {
    public static void main(String[] args) {
        Pokemon[] p = new Pokemon[4];
        Squirtle Squirtle = new Squirtle();
        Charmander Charmander = new Charmander();
        Pikachu Pikachu = new Pikachu();
        Bulbasur Bulbasur = new Bulbasur();
        p[0] = Squirtle; p[1]  = Charmander; p[2] = Pikachu; p[3] = Bulbasur;

        Squirtle.setNum_pokedex(7);
        Squirtle.setNombrePokemon("Squirtle - T");
        Squirtle.setPesoPokemon(9.0);
        Squirtle.setSexo("M");
        Squirtle.setTemporadaQueAparece("Marzo");

        Charmander.setNum_pokedex(4);
        Charmander.setNombrePokemon("Charmander - T");
        Charmander.setPesoPokemon(9.0);
        Charmander.setSexo("M");
        Charmander.setTemporadaQueAparece("Abril");

        Pikachu.setNum_pokedex(3);
        Pikachu.setNombrePokemon("Pikachu - T");
        Pikachu.setPesoPokemon(9.0);
        Pikachu.setSexo("M");
        Pikachu.setTemporadaQueAparece("Marzo");

        Bulbasur.setNum_pokedex(1);
        Bulbasur.setNombrePokemon("Bulbasur - T");
        Bulbasur.setPesoPokemon(9.0);
        Bulbasur.setSexo("M");
        Bulbasur.setTemporadaQueAparece("Marzo");

            mostrarInfoPokemons(p);
    }

    public static void mostrarInfoPokemons(Pokemon[] p){
        for (int i = 0; i <= p.length - 1; i++) {
            System.out.println(p[i].mostrarInfo());
        }
    }

}
