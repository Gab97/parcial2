/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas.Vehiculos;

import AbstractFactory.Razas.Vehiculos.Vehiculos;

/**
 *
 * @author andreu
 */
public class FactoryVehiculos implements Vehiculos{

    @Override
    public void crear_vehiculos() {
        System.out.println("Pague prro :v");
    }   
}
