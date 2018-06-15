/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas;

/**
 *
 * @author andreu
 */
public class Raza_sangre_pura implements Razas {

    @Override
    public void crear_razas(String raz, String raz1) {
        System.out.println("Raza pura sangre listo.");
    }

    @Override
    public void crear_razas(String cadena) {
        System.out.println("Raza pura sangre listo.");
    }

}
