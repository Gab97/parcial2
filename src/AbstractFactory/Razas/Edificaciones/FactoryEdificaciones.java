/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractFactory.Razas.Edificaciones;
import AbstractFactory.AbstractFactory;
import AbstractFactory.Razas.Razas;

public class FactoryEdificaciones implements AbstractFactory{
    
    public Edificaciones getEdificaciones(String type) {
        switch (type) {
            case "1":
                return new Mina_diamantes();
            case "2":
                return new Mina_oro();
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
