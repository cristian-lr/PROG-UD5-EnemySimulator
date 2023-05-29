package net.salesianos.lacuesta.clases.personaje;

import net.salesianos.lacuesta.interfaces.Combate;

public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje(int defensa, int fuerza) {
        this.defensa = defensa;
        this.fuerza = fuerza;
        this.salud = 12;
    }

    public int atacar() {
        return fuerza;
    }


    public void recibirAtaque(int ataque) {
        salud -= (ataque - defensa);
        System.out.println("Personaje: El daño recibido ha sido de " + ataque + " y la salud restante es " + salud);
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
