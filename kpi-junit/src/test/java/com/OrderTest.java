package com;

import org.junit.Test;

public class OrderTest {
	@Test
	public Order createOrder(Order order) {
        Order newOrder = new Order();
        newOrder.name("XYZ");
        newOrder.setOrderStatus("INITIATED");
     
    return newOrder;
}

}

