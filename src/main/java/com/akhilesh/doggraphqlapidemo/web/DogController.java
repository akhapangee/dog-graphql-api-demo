package com.akhilesh.doggraphqlapidemo.web;

import com.akhilesh.doggraphqlapidemo.entity.Dog;
import com.akhilesh.doggraphqlapidemo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    // Injecting through field
    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getDogs(){
        List<Dog> list = dogService.retrieveDogs();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
