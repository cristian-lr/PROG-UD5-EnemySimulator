package net.salesianos.lacuesta.clasesabstractas;

import net.salesianos.lacuesta.clasesabstractas.Mob;
import net.salesianos.lacuesta.interfaces.Danio;

public abstract class MobPacifico extends Mob implements Danio {
    public MobPacifico(int salud) {
        super(salud);
    }

    public void recibirAtaque(int ataque) {
        salud-=ataque;
    }
}
