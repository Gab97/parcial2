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
public class Torre implements Edificaciones{
    @Override
    public void crear_edificaciones() {
        System.out.println("Torre creada.");
    }
    
    @Override
    public void atacar_edificaciones() {
        System.out.println("Peligro, tu torre esta siendo atacada por el enemigo!!");
    }
}
