package Logica.Pokemons;

import Interfaces.IElectrico;
import Logica.Pokemon;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(){

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
    public void atacarImpacTrueno() {
        System.out.println("!Impactrueno¡");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("!Puño Trueno¡");
    }

    @Override
    public void atacarRayo() {
        System.out.println("!Rayo Pulverizante");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("!Ataque Carga Rayo Pulverizante¡");
    }
}
