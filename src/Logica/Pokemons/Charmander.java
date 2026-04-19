package Logica.Pokemons;

import Interfaces.IFuego;
import Logica.Pokemon;

public class Charmander extends Pokemon implements IFuego {

    public Charmander(){ // Constructor Para Charmander

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("!Ataque Placaje¡");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("!Ataque Arañazo¡");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("!Mordisco¡");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("!Punio Fuego¡");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("!Ataque Ascuas¡");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("!Ataque Lanza Llamas¡");
    }
}
