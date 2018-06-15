/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractFactory.Razas.Edificaciones;
import AbstractFactory.AbstractFactory;


public abstract class FactoryEdificaciones implements AbstractFactory{
    
    public Edificaciones getEdificaciones(String edificacion) {
        switch (edificacion) {
            case "mn":
                return new Mina_diamantes();
            case "mo":
                return new Mina_oro();
            case "mm":
                return new Mina_moneda();
        }
        return null;
    }  
}
