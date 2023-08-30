package com.wolffcode.workshopmongodb.repository;

import com.wolffcode.workshopmongodb.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
