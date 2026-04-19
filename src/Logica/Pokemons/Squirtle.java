package Logica.Pokemons;


import Interfaces.IAgua;
import Interfaces.IPlanta;
import Logica.Pokemon;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle(){ // Constructor para Squirtle

    }

    @Override
    public void atacarPlacaje() {
        System.out.println(getNombrePokemon()+"!Ataque Placaje¡");
    }

    @Override
    public void atacarArañazo() {
        System.out.println(getNombrePokemon() + "!Ataque Arañazo¡");
    }

    @Override
    public void atacarMordisco() {
        System.out.println(getNombrePokemon() + "!Mordisco¡");

    }

    @Override
    public void atacarHidroBomba() {
        System.out.println(getNombrePokemon() + "!Daño HidroBomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(getNombrePokemon() + "!Ataque Pistola Agua¡");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println(getNombrePokemon() + "!Impacto Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println(getNombrePokemon() + "!Daño Hidropulso!");
    }
}
