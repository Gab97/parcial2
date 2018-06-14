/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas.Milicia;

/**
 *
 * @author soporte
 */
public class Milicia_sangre_sucia implements Milicia{

    @Override
    public void crear_milicia() {
        System.out.println("Tu milica ha sido creada exitosamente!");
    }

    @Override
    public void milicia_ataca() {
        System.out.println("Tu milicia aun no puede atacar!");
        System.out.println("Tu milicia esta atacando!!!");
        System.out.println("En camino a atacar...");
    }
    
}
