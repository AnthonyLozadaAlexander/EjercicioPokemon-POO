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
