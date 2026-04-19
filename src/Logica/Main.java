package Logica;

import Logica.Pokemons.Bulbasur;
import Logica.Pokemons.Charmander;
import Logica.Pokemons.Pikachu;
import Logica.Pokemons.Squirtle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pokemon[] p = new Pokemon[4]; boolean bandera = false; String op;

        Squirtle Squirtle = new Squirtle();
        Charmander Charmander = new Charmander();
        Pikachu Pikachu = new Pikachu();
        Bulbasur Bulbasur = new Bulbasur();
        p[0] = Squirtle; p[1]  = Charmander; p[2] = Pikachu; p[3] = Bulbasur;

        // Squirtle
        Squirtle.setNum_pokedex(7);
        Squirtle.setNombrePokemon("Squirtle - T");
        Squirtle.setPesoPokemon(9.0);
        Squirtle.setSexo("M");
        Squirtle.setTemporadaQueAparece("Marzo");

        // Charmander
        Charmander.setNum_pokedex(4);
        Charmander.setNombrePokemon("Charmander - T");
        Charmander.setPesoPokemon(9.0);
        Charmander.setSexo("M");
        Charmander.setTemporadaQueAparece("Abril");

        // Pikachu
        Pikachu.setNum_pokedex(3);
        Pikachu.setNombrePokemon("Pikachu - T");
        Pikachu.setPesoPokemon(9.0);
        Pikachu.setSexo("M");
        Pikachu.setTemporadaQueAparece("Marzo");

        // Bulbasur
        Bulbasur.setNum_pokedex(1);
        Bulbasur.setNombrePokemon("Bulbasur - T");
        Bulbasur.setPesoPokemon(9.0);
        Bulbasur.setSexo("M");
        Bulbasur.setTemporadaQueAparece("Marzo");

        System.out.println("Bienvenido A PokeDex\n");
            while(!bandera){ // Mientras (bandera == false)
                System.out.println("-----------------------------------------");
                System.out.println("                  MENU                   ");
                System.out.println("-----------------------------------------");
                System.out.println(" 1. Mostrar Informacion De Los Pokemons");
                System.out.println(" 2. Ver Pokemon De Su Interes");
                System.out.println(" 3. Crea tu Pokemon");
                System.out.println(" 4. Salir");
                System.out.println("-----------------------------------------");
                System.out.print("-> "); op = input.nextLine();

                switch(op){
                    case "1":
                        mostrarInfoPokemons(p);
                        break;
                    case "2":
                        break;

                    case "3":
                        System.out.println("1. Bulbasur\n 2. Charmander \n 3. Pikachu\n 4. Squirtle");
                        String opc = input.nextLine();
                        if(opc.equals("1")){
                            crearPokemon(Bulbasur);
                        }else if(opc.equals("2")){
                            crearPokemon(Charmander);
                        }
                        else if (opc.equals("3")){
                            crearPokemon(Pikachu);
                        }
                        else if (opc.equals("4")) {
                            crearPokemon(Squirtle);
                        }else{
                            System.out.println("Regresando Al Menu");
                        }

                        break;
                    case "4":
                        bandera = true;
                        break;

                    default:
                        System.out.println("Opcion Incorrecta");
                        break;
                }

            }

        System.out.println("Gracias Por Probar El Programa");
    }

    public static void mostrarInfoPokemons(Pokemon[] p){
        for (int i = 0; i <= p.length - 1; i++) {
            System.out.println(p[i].mostrarInfo());
        }
    }

    public static void crearPokemon(Pokemon p){
        System.out.println("Escriba el nombre del Pokemon");
    }

}
