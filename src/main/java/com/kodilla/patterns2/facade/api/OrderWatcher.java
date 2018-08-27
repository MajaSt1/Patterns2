package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER= LoggerFactory.getLogger(OrderWatcher.class);

    @After(value ="execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            " && args(userId) && target(order)")
    public void watchOrder(OrderDto order, Long userId){
        LOGGER.info("Order method run " +order.getClass().getName()+ "with userId "+ userId);
    }
}