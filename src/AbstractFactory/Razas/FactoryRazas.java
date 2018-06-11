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

    public Razas getRazas(String type) {
        switch (type) {
            case "1":
                return new Raza_pura_sangre();
            case "2":
                return new Raza_sangre_sucia();
            case "3":
                return new Raza_los_que_no_son_nada();
        }
        return null;
    }
    
}
