package com.akhilesh.doggraphqlapidemo.resolver;

import com.akhilesh.doggraphqlapidemo.entity.Dog;
import com.akhilesh.doggraphqlapidemo.exception.DogNotFoundException;
import com.akhilesh.doggraphqlapidemo.repository.DogRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private DogRepository dogRepository;

    public Query(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> findAllDogs() {
        return dogRepository.findAll();
    }

    public Dog findDogById(Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if (optionalDog.isPresent()) {
            return optionalDog.get();
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }


}
