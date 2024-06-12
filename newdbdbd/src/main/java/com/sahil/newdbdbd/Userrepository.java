package com.sahil.newdbdbd;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Userrepository extends MongoRepository<ModelUser,String> {
}
