/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas;

import AbstractFactory.AbstractFactory;

/**
 *
 * @author andreu
 */
public class FactoryRazas implements AbstractFactory {

    @Override
    public Razas getRazas(String type) {
        switch (type) {
            case "RS":
                return new Raza_sangre_pura();
            case "RS2":
                return new Raza_sangre_sucia();
            case "RS3":
                return new Raza_sangre_normal();
        }
        return null;
    }
    
}
