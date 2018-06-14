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
public class Mina_moneda implements Edificaciones{

    @Override
    public void crear_edificaciones() {
        System.out.println("Mima creada");
    }

    @Override
    public void atacar_edificaciones() {
        System.out.println("Tu mina esta siendo atacada!!!");
    }
    
}
