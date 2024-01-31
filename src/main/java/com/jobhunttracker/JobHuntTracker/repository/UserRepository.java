package com.jobhunttracker.JobHuntTracker.repository;

import com.jobhunttracker.JobHuntTracker.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends MongoRepository<User, String> {


}
