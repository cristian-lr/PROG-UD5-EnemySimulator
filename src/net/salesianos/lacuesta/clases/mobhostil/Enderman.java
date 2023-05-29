package net.salesianos.lacuesta.clases.mobhostil;

import net.salesianos.lacuesta.clasesabstractas.MobHostil;

public class Enderman extends MobHostil {
    public Enderman() {
        super(14, 6);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void moverse() {
        System.out.println("Se teletransporta detrás");
    }

    @Override
    public void recibirAtaque(int ataque) {
        salud -= ataque;
        System.out.println("Enderman: El daño recibido es de " + ataque + " y la salud restante es " + salud);
    }

}
