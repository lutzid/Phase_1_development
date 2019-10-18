package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Library;
import com.future.batch4.devSurabaya.projectphase1.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

//    public List<Library> findByOwnerUsername(String username){
//        return libraryRepository.findByLibraryOwnerUsername(username);
//    }

    public Library findLibraryById(String libraryId){
        return libraryRepository.findLibraryById(libraryId);
    }

    public Library save(Library library){
        return libraryRepository.save(library);
    }

    public long deleteLibraryById(String libraryId){
        return libraryRepository.deleteLibraryById(libraryId);
    }
}
