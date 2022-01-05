package com.Oydin.user.service.Repository;

import com.Oydin.user.service.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByUserId(String userId);
}
