/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas.Edificaciones;

/**
 *
 * @author soporte
 */
public class Mina implements Edificaciones{

    @Override
    public void crear_edificaciones() {
        System.out.println("Tu mina ha sido creada con exito!");
    }

    @Override
    public void atacar_edificaciones() {
        System.out.println("Oh no! tu mina esta siendo atacada por el enemigo.");
    }
    
}
