package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TheBigHamPineapple extends AbstractPizzaOrderDecorator {

    public TheBigHamPineapple (PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost(){
       return super.getPizzaCost().add(new BigDecimal(10));
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + " + pineapple + ham + extra cheese";
    }
}
