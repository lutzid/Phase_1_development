package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Store;
import com.future.batch4.devSurabaya.projectphase1.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StoreRepository extends JpaRepository<Store, String> {
    @Query(
            " SELECT s " +
            " FROM Store s " +
            " WHERE s.name = ?1 " )
    Store findByStoreName(String name);

    @Query(value = " SELECT s " +
            " FROM Store s" +
            " LEFT JOIN FETCH s.user u" +
            " WHERE u.name = ?1")
    Store findByStoreOwnerName(String name);

    @Query("SELECT s " +
            " FROM Store s " +
            " LEFT JOIN FETCH s.user u" +
            " WHERE u.username = ?1")
    Store findByStoreOwnerUsername(String username);

    @Transactional
    long deleteStoreById(String storeId);
}
