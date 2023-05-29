import net.salesianos.lacuesta.clases.mobhostil.Zombie;
import net.salesianos.lacuesta.clases.personaje.Personaje;
import net.salesianos.lacuesta.clasesabstractas.MobHostil;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fuerza;
        int defensa;
        int mobRandom;
        int turnos = 0;
        System.out.println("Bienvenido");
        System.out.println("¿Qué arma llevará el personaje?");
        System.out.println("1.Ninguna.Fuerza:0");
        System.out.println("2.Espada madera.Fuerza:2");
        System.out.println("3.Espada de hierro.Fuerza:3");
        System.out.println("4.Espada de diamante.Fuerza:5");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                fuerza = 1;
                break;
            case 2:
                fuerza = 2;
                break;
            case 3:
                fuerza = 3;
                break;
            case 4:
                fuerza = 5;
                break;
            default:
                System.out.println("Opción no válida");
                fuerza = 0;
        }

        System.out.println("¿Qué armadura llevará el personaje?");
        System.out.println("1.Ninguna.Defensa:0");
        System.out.println("2.De cuero.Defensa:1");
        System.out.println("3.De hierro.Defensa:2");
        System.out.println("4.De diamante.Defensa:3");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                defensa = 0;
                break;

            case 2:
                defensa = 1;
                break;
            case 3:
                defensa = 2;
                break;
            case 4:
                defensa = 3;
                break;
            default:
                System.out.println("Opción no válida");
                defensa = 0;
                break;
        }
        Personaje personaje = new Personaje(defensa, fuerza);
        Zombie zombie = new Zombie();

        do {
            zombie.recibirAtaque(personaje.atacar());
            if (zombie.getSalud() < 1) break;
            Random random = new Random();
            mobRandom = random.nextInt(2);
            if (mobRandom == 0) {
                personaje.recibirAtaque(zombie.atacar());
            } else {
                zombie.moverse();
            }
            turnos++;
        } while (zombie.getSalud() > 0 && personaje.getSalud() > 0);

        if (zombie.getSalud() > personaje.getSalud()) {
            System.out.println("\nSalió ganador el zombie");
        } else {
            System.out.println("\nSalió ganador el personaje");
        }
        System.out.println("Han pasado " + turnos + " turnos");
    }
}
