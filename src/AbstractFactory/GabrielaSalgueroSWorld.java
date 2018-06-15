/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Razas.Raza_sangre_pura;
import AbstractFactory.Razas.Razas;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author andreu
 */
public class GabrielaSalgueroSWorld {

    /**
     * Patron de diseño Sigleton
     */
    public static void main(String[] args) {

        GabrielaSalgueroSWorld menuVideojuego = GabrielaSalgueroSWorld.getInstance();
        menuVideojuego.videojuego();
    }

    private static GabrielaSalgueroSWorld menuVideojuego;

    private GabrielaSalgueroSWorld() {
    }

    public static GabrielaSalgueroSWorld getInstance() {
        if (menuVideojuego == null) {
            menuVideojuego = new GabrielaSalgueroSWorld();
        }
        return menuVideojuego;
    }

    public void videojuego() {

        //------------------------------------------- Inicio del juego --------------------------------------------------------------------------------
        Scanner jugador1 = new Scanner(System.in);
        Scanner jugador2 = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);

        int intento = 0;

        System.out.println("-------------------------- Bienvenidos a mi mundo :D ------------------------------");
        System.out.println("Jugador 1, ingrese el nombre: ");
        String nombre1 = jugador1.nextLine();
        System.out.println(nombre1 + " elige la raza: ");
        System.out.println("1- Raza sangre pura.");
        System.out.println("2- Raza sangre sucia.");
        System.out.println("3- Raza sangre normal.");
        String raz = jugador1.nextLine();

        System.out.println("Jugador 2, ingrese el nombre: ");
        String nombre2 = jugador2.nextLine();
        System.out.println(nombre2 + " elige la raza: ");
        System.out.println("1- Raza sangre pura.");
        System.out.println("2- Raza sangre sucia.");
        System.out.println("3- Raza sangre normal.");
        String raz1 = jugador2.nextLine();

        try {
            int opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    AbstractFactory factory;

                    factory = FactoryProducer.getFactory("razas");
                    Razas pura = factory.getRazas("pura");
                    pura.crear_razas(raz);
                    Raza_sangre_pura ra = new Raza_sangre_pura();
                    ra.crear_razas(raz, raz1);

                case 2:
                    factory = FactoryProducer.getFactory("Razas");
                    Razas Raza_sangre_sucia = factory.getRazas("sucia");
                    Raza_sangre_sucia.crear_razas(raz, raz1);
                    break;

                case 3:
                    factory = FactoryProducer.getFactory("Razas");
                    Razas Raza_sangre_normal = factory.getRazas("normal");
                    Raza_sangre_normal.crear_razas(raz, raz1);
                    break;

                default:
                    System.out.println("Por favor ingrese una opcion valida");
            }

        } catch (InputMismatchException e) {
            System.err.println("Por favor, Ingrese un número");
            menu.nextLine();

//------------------------------------------------- Menu del juego ---------------------------------------------------------------------------------
            Scanner datos = new Scanner(System.in);
            
            
            do {
                int seguir = 0;

                do {
                    int opcion = 0; 
                    
                    System.out.println("-----------------------------  MENU  -------------------------------");
                    System.out.println(" elige la raza: ");
                    System.out.println("1- Raza sangre pura.");
                    System.out.println("2- Raza sangre sucia.");
                    System.out.println("3- Raza sangre normal.");
                    opcion = datos.nextInt();
                    
                    try {
                        opcion = datos.nextInt();

                        switch (opcion) {
                            case 1:
                                break;
                                
                            case 2:
                                System.out.println("prueba2");
                                break;

                            case 3:
                                System.out.println("pruebaaaaaaaaaaa");
                                break;

                            case 4:
                                System.out.println("Ingrese el piso, seguido del numero de habitacion: ");
                                break;

                            case 5:
                                System.out.println("Ingrese el piso: ");
                                break;

                            case 6:
                                System.out.println("pruebaaaaaaaaaa");
                                break;

                            case 7:
                                System.out.println("holaaaaaaaaaaa");
                                break;

                            case 8:
                                System.out.println("holi");
                                break;

                            case 9:
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Por favor ingrese una opcion valida");
                                
                        }
                        System.out.println("Para continuar digite 1...");
                        seguir = datos.nextInt();

                    } catch (InputMismatchException p) {
                        System.err.println("Por favor, Ingrese un número");
                        datos.nextLine();
                    }
                    
                } while (seguir == 1);
                
            } while (intento == 1);
        }
    }
}

