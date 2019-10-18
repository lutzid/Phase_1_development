package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Wishlist;
import com.future.batch4.devSurabaya.projectphase1.repository.WishlistRepository;
import com.future.batch4.devSurabaya.projectphase1.service.WishlistService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class WishlistController {
    @Autowired
    private WishlistService wishlistService;

    @PostMapping(ApiPath.WISHLIST)
    public Wishlist save(@RequestBody Wishlist wishlist){
        return wishlistService.save(wishlist);
    }

    @GetMapping(ApiPath.WISHLIST_BY_ID)
    public Wishlist findWishlistById(@PathVariable String wishlistId){
        return wishlistService.findWishlistById(wishlistId);
    }

    @DeleteMapping(ApiPath.WISHLIST_BY_ID)
    public boolean deleteWishlistById(@PathVariable String wishlistId){
        return wishlistService.deleteWishlistById(wishlistId) > 0;
    }
}
