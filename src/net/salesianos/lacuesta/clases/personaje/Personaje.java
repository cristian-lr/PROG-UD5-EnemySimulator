package net.salesianos.lacuesta.clases.personaje;

import net.salesianos.lacuesta.interfaces.Combate;

public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje(int defensa, int fuerza) {
        this.defensa = defensa;
        this.fuerza = fuerza;
        this.salud=12;
    }

    public int atacar(){
        return fuerza;
    }


    public void recibirAtaque(int ataque) {
        salud-=(ataque-defensa);
        System.out.println("El daño recibido ha sido de "+ataque+" y la salud restante es "+salud);
    }
}
