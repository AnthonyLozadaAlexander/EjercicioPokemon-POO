package Logica.Pokemons;

import Interfaces.IPlanta;
import Logica.Pokemon;

public class Bulbasur extends Pokemon implements IPlanta {

    public Bulbasur(){

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println(getNombrePokemon() +" !Ataque Placaje¡");
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
    public void atacarParalizar() {
        System.out.println(getNombrePokemon() + "!Ataque Paralizar¡");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println(getNombrePokemon() + "!Ataque Drenaje¡");
    }

    @Override
    public void atacaHojaAfilada() {
        System.out.println(getNombrePokemon() + "!Ataque Hoja Afilada¡");
    }

    @Override
    public void atacarLatigoCepa() {

        System.out.println(getNombrePokemon() + "!Ataque Latigo Cepa¡");

    }
}
