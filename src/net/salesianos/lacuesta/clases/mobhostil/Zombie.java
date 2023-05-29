package net.salesianos.lacuesta.clases.mobhostil;

import net.salesianos.lacuesta.clasesabstractas.MobHostil;

public class Zombie extends MobHostil {
    public Zombie() {
        super(10, 4);
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
        System.out.println("Se mueve hacia atrás el zombie");
    }

    @Override
    public void recibirAtaque(int ataque) {
        salud -= ataque;
        System.out.println("Zombie: El daño recibido es de " + ataque + " y la salud restante es " + salud);
    }

}
