/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Razas.Razas;

/**
 *
 * @author andreu
 */
public interface AbstractFactory {
    
    Razas getRazas(String type);
    
}
