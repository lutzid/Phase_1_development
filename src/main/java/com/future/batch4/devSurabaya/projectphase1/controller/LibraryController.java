package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Library;
import com.future.batch4.devSurabaya.projectphase1.service.LibraryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class LibraryController {
    @Autowired
    LibraryService libraryService;

    @PostMapping(ApiPath.LIBRARY)
    public Library save(@RequestBody Library library){
        return libraryService.save(library);
    }

    @GetMapping(ApiPath.LIBRARY_BY_ID)
    public Library findLibraryById(@PathVariable String libraryId){
        return libraryService.findLibraryById(libraryId);
    }

    @DeleteMapping(ApiPath.LIBRARY_BY_ID)
    public boolean deleteLibraryById(@PathVariable String libraryId){
        return libraryService.deleteLibraryById(libraryId) > 0;
    }
}
