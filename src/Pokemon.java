public abstract class Pokemon {
    private int num_pokedex;
    private String nombrePokemon;
    private double pesoPokemon;
    private String sexo;
    private String temporadaQueAparece;

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

    public abstract void atacarPlacaje();
    public abstract void atacarArañazo();
    public abstract void atacarMordisco();

}
