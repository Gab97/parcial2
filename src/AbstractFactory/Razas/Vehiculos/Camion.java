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
public class Camion implements Vehiculos{

    @Override
    public void crear_vehiculos() {
        System.out.println("Tu camion ha sido creado.");
    }

    @Override
    public void atacar_vehiculos() {
        System.out.println("Tu camion esta siendo atacado!!");
    }
    
}
