package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testTheBigHamPineApple(){
        //Given
        PizzaOrder pizza= new BasicPizza();

        pizza=new TheBigHamPineapple(pizza);
        //When
        BigDecimal cost = pizza.getPizzaCost();
        String ingredients= pizza.getIngredients();
        //Then
        assertEquals(new BigDecimal(25),cost);
        assertEquals("tomato sauce + cheese + pineapple + ham + extra cheese",ingredients);

        System.out.println("Pizza cost : " + cost + " ,with ingredients: " + ingredients);
    }
    @Test
    public void testFullIngredients(){
        //
        PizzaOrder pizza= new BasicPizza();

        pizza= new TheBigHamPineapple(pizza);
        pizza= new TheBigPepperoni(pizza);
        //
        BigDecimal cost = pizza.getPizzaCost();
        String ingredients= pizza.getIngredients();
        //
        assertEquals(new BigDecimal(32),cost);
        assertEquals("tomato sauce + cheese + pineapple + ham + extra cheese + pepperoni + mozzarella"
                ,ingredients);

        System.out.println("Pizza cost : " + cost + " ,with ingredients: " + ingredients);
    }
}
