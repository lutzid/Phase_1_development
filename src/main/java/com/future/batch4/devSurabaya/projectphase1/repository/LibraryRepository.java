package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library,String> {
//    @Query("SELECT l " +
//            "FROM library l " +
//            "JOIN user u " +
//            "ON u.username = l.username " +
//            "WHERE l.username = ?1")
//    List<Library> findByLibraryOwnerUsername(String username);

    Library findLibraryById(String libraryId);

    @Transactional
    long deleteLibraryById(String libraryId);
}
