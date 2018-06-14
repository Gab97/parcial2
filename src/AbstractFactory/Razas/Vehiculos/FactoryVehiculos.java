/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas.Vehiculos;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Razas.Razas;

/**
 *
 * @author andreu
 */
public class FactoryVehiculos implements AbstractFactory{
    public Vehiculos getVehiculos(String type) {
        switch (type) {
            case "1":
                //return new ;
            case "2":
                //return new);
            case "3":
                //return new Raza_los_que_no_son_nada();
        }
        return null;
    }

    @Override
    public Razas getRazas(String raza_sangre_pura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
}
