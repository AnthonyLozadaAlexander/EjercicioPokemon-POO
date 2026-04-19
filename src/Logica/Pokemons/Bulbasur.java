package Logica.Pokemons;

import Interfaces.IPlanta;
import Logica.Pokemon;

public class Bulbasur extends Pokemon implements IPlanta {

    public Bulbasur(){

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
    public void atacarParalizar() {
        System.out.println("!Ataque Paralizar¡");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("!Ataque Drenaje¡");
    }

    @Override
    public void atacaHojaAfilada() {
        System.out.println("!Ataque Hoja Afilada¡");
    }

    @Override
    public void atacarLatigoCepa() {

        System.out.println("!Ataque Latigo Cepa¡");

    }
}
