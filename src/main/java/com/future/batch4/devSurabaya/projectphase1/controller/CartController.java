package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Cart;
import com.future.batch4.devSurabaya.projectphase1.service.CartService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping(ApiPath.CART)
    public Cart save(Cart cart){
        return cartService.save(cart);
    }

    @GetMapping(ApiPath.CART_BY_ID)
    public Cart findCartById(@PathVariable String cartId){
        return cartService.findCartById(cartId);
    }

    @DeleteMapping(ApiPath.CART_BY_ID)
    public boolean deleteCartById(@PathVariable String cartId){
        return cartService.deleteCartById(cartId) > 0;
    }
}
