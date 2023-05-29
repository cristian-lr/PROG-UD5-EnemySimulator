package net.salesianos.lacuesta.clases.mobpacifico;

import net.salesianos.lacuesta.clasesabstractas.MobPacifico;

public class Oveja extends MobPacifico {
    public Oveja() {
        super(5);
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve por el campo");
    }
}
