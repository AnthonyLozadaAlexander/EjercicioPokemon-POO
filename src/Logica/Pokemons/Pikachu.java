package Logica.Pokemons;

import Interfaces.IElectrico;
import Logica.Pokemon;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(){

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println(getNombrePokemon()+"!Ataque Placaje¡");
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
    public void atacarImpacTrueno() {
        System.out.println(getNombrePokemon() + "!Impactrueno¡");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(getNombrePokemon() + "!Puño Trueno¡");
    }

    @Override
    public void atacarRayo() {
        System.out.println(getNombrePokemon() + "!Rayo Pulverizante");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(getNombrePokemon() + "!Ataque Carga Rayo Pulverizante¡");
    }

    @Override
    public void mostrarAtaques(){
        System.out.println(getNombrePokemon() + "\n" +
                "Puede Usar Los Siguientes Ataques: " + "\n");
        System.out.println("1. Placaje" + "\n" +
                "2. Arañazo" + "\n" +
                "3. Mordisco" + "\n" +
                "4. Paralizar" + "\n" +
                "5. Drenaje" + "\n" +
                "6. Hoja Afilada" + "\n" +
                "7. Latigo Cepa\n");
    }
}
