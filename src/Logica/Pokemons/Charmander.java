package Logica.Pokemons;

import Interfaces.IFuego;
import Logica.Pokemon;

public class Charmander extends Pokemon implements IFuego {

    public Charmander(){ // Constructor Para Charmander

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println( getNombrePokemon()+"!Ataque Placaje¡");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println(getNombrePokemon() + "!Ataque Arañazo¡");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println(getNombrePokemon() + "!Mordisco¡");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println(getNombrePokemon() + "!Punio Fuego¡");
    }

    @Override
    public void atacarAscuas() {
        System.out.println(getNombrePokemon() + "!Ataque Ascuas¡");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println(getNombrePokemon() + "!Ataque Lanza Llamas¡");
    }
}
