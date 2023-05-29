package net.salesianos.lacuesta;

public class Zombie extends MobHostil {
    public Zombie() {
        super(10,4);
    }

    public void moverse() {
        System.out.println("Se mueve hacia atrás el personaje");
    }
}
