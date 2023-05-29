package net.salesianos.lacuesta.clases.mobhostil;

import net.salesianos.lacuesta.clasesabstractas.MobHostil;

public class Enderman extends MobHostil {
    public Enderman() {
        super(14, 6);
    }

    public void moverse() {
        System.out.println("Se teletransporta detrás");
    }
}
