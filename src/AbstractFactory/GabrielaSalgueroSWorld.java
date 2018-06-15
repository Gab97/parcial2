/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Razas.Edificaciones.Mina_diamantes;
import AbstractFactory.Razas.Edificaciones.Mina_moneda;
import AbstractFactory.Razas.Edificaciones.Mina_oro;
import AbstractFactory.Razas.Milicia.Milicia_sangre_normal;
import AbstractFactory.Razas.Milicia.Milicia_sangre_pura;
import AbstractFactory.Razas.Milicia.Milicia_sangre_sucia;
import AbstractFactory.Razas.Raza_sangre_pura;
import AbstractFactory.Razas.Razas;
import AbstractFactory.Razas.Vehiculos.Camion;
import AbstractFactory.Razas.Vehiculos.Carro;
import AbstractFactory.Razas.Vehiculos.Tanqueta;
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
            Scanner menu2 = new Scanner(System.in);
            
            
            
            do {
                int seguir = 0;

                do {
                    int  opcion2 = menu2.nextInt();
                    
                    System.out.println("-----------------------------  MENU  -------------------------------");
                    System.out.println(nombre1 + " elige una opcion.");
                    System.out.println("1- Edificaciones.");
                    System.out.println("2- Vehiculos.");
                    System.out.println("3- Milicia.");
                    opcion2 = menu2.nextInt();
                    
                    System.out.println(nombre2 + " elige una opcion.");
                    System.out.println("1- Edificaciones.");
                    System.out.println("2- Vehiculos.");
                    System.out.println("3- Milicia.");
                    opcion2 = menu2.nextInt();
                    
                    try {
                        opcion2 = menu2.nextInt();
                        int  opcion3 = menu2.nextInt();
                        int  opcion4 = menu2.nextInt();

                        switch (opcion2) {
                            //------------  Menu de edificaciones -------------------
                            case 1:
                                System.out.println(nombre1+" elige una opcion.");
                                System.out.println("1- Crear edificacion.");
                                System.out.println("2- Recoleccion.");
                                opcion3 = menu2.nextInt();
                                
                                switch (opcion3){                                    
                                    case 1:
                                        System.out.println("1- Crear mina de diamantes.");
                                        System.out.println("2- Crear mina de monedas.");
                                        System.out.println("3- Crear mina de oro.");  
                                        opcion4 = menu2.nextInt();
                                        
                                        switch(opcion4){
                                            case 1 :
                                                Mina_diamantes md = new Mina_diamantes();
                                                md.crear_edificaciones();
                                                break;
                                                
                                            case 2 :
                                                Mina_oro mo = new Mina_oro();
                                                mo.crear_edificaciones();
                                                break;
                                                
                                            case 3 :
                                                Mina_moneda mm = new Mina_moneda();
                                                mm.crear_edificaciones();
                                                break;
                                        }
                                        break;
                                    
                                    case 2:
                                        break;
                                }
                                break;
                            //---------- Menu de vehiculos -----------    
                            case 2:
                                System.out.println(nombre1+" elige una opcion.");
                                System.out.println("1- Crear Vehiculos.");
                                //System.out.println("2- Recoleccion.");
                                opcion3 = menu2.nextInt();
                                
                                switch (opcion3){                                    
                                    case 1:
                                        System.out.println("1- Crear camion.");
                                        System.out.println("2- Crear carro.");
                                        System.out.println("3- Crear tanqueta.");  
                                        opcion4 = menu2.nextInt();
                                        
                                        switch(opcion4){
                                            case 1 :
                                                Camion c = new Camion();
                                                c.crear_vehiculos();
                                                break;
                                                
                                            case 2 :
                                                Carro ca = new Carro();
                                                ca.crear_vehiculos();                                               
                                                break;
                                                
                                            case 3 :
                                                Tanqueta ta = new Tanqueta();
                                                ta.atacar_vehiculos();
                                                break;
                                        }
                                        break;
                                    
                                    case 2:
                                        break;
                                }
                                break;
                                
                            // ----------- Menu de milicia ------------------    
                            case 3:
                                System.out.println(nombre1+" elige una opcion.");
                                System.out.println("1- Crear milicia.");
                                //System.out.println("2- Recoleccion.");
                                opcion3 = menu2.nextInt();
                                
                                switch (opcion3){                                    
                                    case 1:
                                        System.out.println("1- Crear milicia sangre normal.");
                                        System.out.println("2- Crear milicia sangre sucia.");
                                        System.out.println("3- Crear milicia sangre pura.");  
                                        opcion4 = menu2.nextInt();
                                        
                                        switch(opcion4){
                                            case 1 :
                                                Milicia_sangre_normal msn = new Milicia_sangre_normal();
                                                msn.crear_milicia();
                                                break;
                                                
                                            case 2 :
                                                Milicia_sangre_sucia mss = new Milicia_sangre_sucia();
                                                mss.crear_milicia();                                              
                                                break;
                                                
                                            case 3 :
                                                Milicia_sangre_pura msp = new Milicia_sangre_pura();
                                                msp.crear_milicia();
                                                break;
                                        }
                                        break;
                                    
                                    case 2:
                                        break;
                                }
                                break;                               

                            default:
                                System.out.println("Por favor ingrese una opcion valida.");
                                
                        }
                        seguir = menu2.nextInt();

                    } catch (InputMismatchException p) {
                        System.err.println("Por favor, Ingrese un número");
                        menu2.nextLine();
                    }
                    
                } while (seguir == 1);
                
            } while (intento == 1);
        }
    } 
}


