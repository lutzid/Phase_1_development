package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Cart;
import com.future.batch4.devSurabaya.projectphase1.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public Cart save(Cart cart){
        return cartRepository.save(cart);
    }

    public Cart findCartById(String cartId){
        return cartRepository.findCartById(cartId);
    }

    public long deleteCartById(String cartId){
        return cartRepository.deleteCartById(cartId);
    }
}