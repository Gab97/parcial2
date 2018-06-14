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
public class Milicia_sangre_normal implements Milicia{

    @Override
    public void crear_milicia() {
        System.out.println("Tu milicia ha sido creada exitosamente!");
    }

    @Override
    public void milicia_ataca() {
        System.out.println("Tu milicia no esta lista para atacar");
        System.out.println("Tu milicia esta en camino para atacar...");
        System.out.println("Tu milicia esta atacando.");
    }
    
}
