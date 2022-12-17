package com.akhilesh.doggraphqlapidemo.repository;

import com.akhilesh.doggraphqlapidemo.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
