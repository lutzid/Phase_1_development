package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Wishlist;
import com.future.batch4.devSurabaya.projectphase1.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WishlistService {
    @Autowired
    private WishlistRepository wishlistRepository;

    public Wishlist findWishlistById(String wishlistId){
        return wishlistRepository.findWishlistById(wishlistId);
    }

    public Wishlist save(Wishlist wishlist){
        return wishlistRepository.save(wishlist);
    }

    public long deleteWishlistById(String wishlistId){
        return wishlistRepository.deleteWishlistById(wishlistId);
    }
}
