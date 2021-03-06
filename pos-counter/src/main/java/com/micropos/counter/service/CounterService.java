package com.micropos.counter.service;

import com.micropos.dto.CartDto;
import com.micropos.dto.CartItemDto;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    public double getTotal(CartDto cart) {
        System.out.println("checkout: " + cart);
        if (cart.getItems() == null)
            return 0.0;
        double total = 0;
        for (CartItemDto item : cart.getItems()) {
            total += item.getAmount() * item.getProduct().getPrice();
        }
        return total;
    }
}
