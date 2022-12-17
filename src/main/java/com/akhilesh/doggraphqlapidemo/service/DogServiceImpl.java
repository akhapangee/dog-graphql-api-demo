package com.akhilesh.doggraphqlapidemo.service;

import com.akhilesh.doggraphqlapidemo.entity.Dog;
import com.akhilesh.doggraphqlapidemo.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {
    private DogRepository dogRepository;

    // Injecting through construction
    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }
}
