package net.salesianos.lacuesta.clasesabstractas;

import net.salesianos.lacuesta.clasesabstractas.Mob;
import net.salesianos.lacuesta.interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    protected int fuerza;

    public MobHostil(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }


    public int atacar() {
        return fuerza;
    }

    public void recibirAtaque(int ataque) {
        salud -= ataque;
        System.out.println("El daño recibido es de " + ataque + " y la salud restante es " + salud);
    }


}
