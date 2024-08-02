/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.factory;

import ifsc.com.designpatterns.factory.abstracts.Restaurant;
import ifsc.com.designpatterns.factory.model.BeefBurgerCreatorRestaurant;
import ifsc.com.designpatterns.factory.model.VeggieBurgerCreatorRestaurant;

/**
 *
 * @author aluno
 */
public class GoFFactory {
    
    public static void main(String[] args) {
        Restaurant beef = new BeefBurgerCreatorRestaurant();
        beef.orderBurger();
        
        Restaurant veggie = new VeggieBurgerCreatorRestaurant();
        veggie.orderBurger();
    }
}
