package Logica.Pokemons;


import Interfaces.IAgua;
import Interfaces.IPlanta;
import Logica.Pokemon;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle(){ // Constructor para Squirtle

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
    public void atacarHidroBomba() {
        System.out.println("!Daño HidroBomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Ataque Pistola Agua¡");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("!Impacto Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Daño Hidropulso!");
    }
}
