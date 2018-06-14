/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas.Vehiculos;

/**
 *
 * @author soporte
 */
public class Tanqueta implements Vehiculos{

    @Override
    public void crear_vehiculos() {
        System.out.println("Tanqueta creada!");
    }

    @Override
    public void atacar_vehiculos() {
        System.out.println("Tu tanqueta esta siendo atacada por el enemigo!");
    }
    
}
