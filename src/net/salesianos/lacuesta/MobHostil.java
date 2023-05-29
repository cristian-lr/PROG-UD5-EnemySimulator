package net.salesianos.lacuesta;

public abstract class MobHostil extends Mob implements Combate{
    private int fuerza;

    public MobHostil(int salud,int fuerza) {
        super(salud);
        this.fuerza=fuerza;
    }

    public int atacar() {
        return fuerza;
    }


    public void recibirAtaque(int ataque) {
        salud-=ataque;
        System.out.println("El daño recibido es de "+ataque+" y la salud restante es: "+salud);
    }

}
