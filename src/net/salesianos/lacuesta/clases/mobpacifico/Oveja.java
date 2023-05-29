package net.salesianos.lacuesta.clases.mobpacifico;

import net.salesianos.lacuesta.clasesabstractas.MobPacifico;

public class Oveja extends MobPacifico {
    public Oveja() {
        super(5);
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void moverse() {
        System.out.println("Se mueve por el campo");
    }
}
