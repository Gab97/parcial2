/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas.Edificaciones;



/**
 *
 * @author andreu
 */
public class FactoryEdificaciones {
    
    public Edificaciones getEdificaciones(String type) {
        switch (type) {
            case "1":
                return new Recurso1_RPS();
            case "2":
                return new Recurso2_RPS();
            case "3":
                return new Recurso3_RPS();
        }
        return null;
    }
}
