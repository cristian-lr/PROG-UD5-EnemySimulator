package net.salesianos.lacuesta.clases.mobhostil;

import net.salesianos.lacuesta.clasesabstractas.MobHostil;

public class Zombie extends MobHostil {
    public Zombie() {
        super(10,4);
    }

    public void moverse() {
        System.out.println("Se mueve hacia atrás el personaje");
    }
}
