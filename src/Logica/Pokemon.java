package Logica;

import Interfaces.IAgua;
import Interfaces.IElectrico;
import Interfaces.IFuego;
import Interfaces.IPlanta;

public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected String temporadaQueAparece;

    protected abstract void atacarPlacaje();
    protected abstract void atacarArañazo();
    protected abstract void atacarMordisco();

    public void setNum_pokedex(int num_pokedex){
        this.num_pokedex = num_pokedex;
    }

    public void setNombrePokemon(String nombrePokemon){
        this.nombrePokemon = nombrePokemon;
    }

    public void setPesoPokemon(double pesoPokemon){
        this.pesoPokemon = pesoPokemon;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setTemporadaQueAparece(String temporadaQueAparece){
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTemporadaQueAparece() {
        return temporadaQueAparece;
    }



}
