/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Razas.Razas;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.Menu;

/**
 *
 * @author andreu
 */
public class GabrielaSalgueroSWorld {
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

        Scanner jugador1 = new Scanner(System.in);
        Scanner jugador2 = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);

        int intento = 0;

        
                System.out.println("-------------------------- Bienvenidos ------------------------------");
                System.out.println("Jugador 1 - Ingrese el nombre: ");
                String nombre1 =jugador1.nextLine();
                System.out.println("Jugador 2 - Ingrese el nombre: ");
                String nombre2 =jugador2.nextLine();
                
        do {
            int opcion = 0, seguir = 0, raza = 0;
            
            do {
                System.out.println("------------------  MENU --------------------");
                System.out.println(nombre1 + " elige la raza: ");
                System.out.println("1- Raza sangre pura.");
                System.out.println("2- Raza sangre sucia.");
                System.out.println("3- Raza sangre normal.");
                opcion = datos.nextInt();
                try {
                    //opcion = datos.nextInt();

                    switch (opcion) {
                        case 1:
                            switch(raza){
                                case 1:
                                    AbstractFactory factory;
                                    
                                    factory = FactoryProducer.getFactory("Razas");
                                    Razas RS = factory.getRazas("RS");
                                    RS.crear_razas();
                                    break;
                                    
                                case 2:
                                    
                                    factory = FactoryProducer.getFactory("Razas");
                                    Razas Raza_sangre_sucia = factory.getRazas("2");
                                    Raza_sangre_sucia.crear_razas();
                                    break;
                                    
                                case 3:

                                    factory = FactoryProducer.getFactory("Razas");
                                    Razas Raza_sangre_normal = factory.getRazas("3");
                                    Raza_sangre_normal.crear_razas();
                                    break;
                            }
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
                    //System.out.println("Para continuar digite 1...");
                    //seguir = datos.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("Por favor, Ingrese un número");
                    datos.nextLine();
                }
            } while (seguir == 1);
        } while (intento== 1);
    }
}