package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TheBigPepperoni extends AbstractPizzaOrderDecorator{
    public TheBigPepperoni (PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost(){
        return super.getPizzaCost().add(new BigDecimal(7));
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + " + pepperoni + mozzarella";
    }
}
