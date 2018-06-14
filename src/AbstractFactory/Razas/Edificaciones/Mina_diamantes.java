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
public class Mina_diamantes implements Edificaciones{
    @Override
    public void crear_edificaciones() {
        System.out.println("Mina creada exitosamente.");
    }
    
    @Override
    public void atacar_edificaciones() {
        System.out.println("Peligro, tumira esta siendo atacada por el enemigo!!");
    }
}
