/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Razas.Milicia;

import AbstractFactory.Razas.Milicia.Milicia;

/**
 *
 * @author andreu
 */
public class FactoryMilicia implements Milicia{

    @Override
    public void crear_milicia() {
        System.out.println("milicia creada ");
    }
}
