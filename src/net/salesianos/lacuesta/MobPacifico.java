package net.salesianos.lacuesta;

public abstract class MobPacifico extends Mob implements Danio {
    public MobPacifico(int salud) {
        super(salud);
    }

    public void recibirAtaque(int ataque) {
        salud-=ataque;
    }
}
