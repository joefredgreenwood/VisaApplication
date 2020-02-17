package com.mastek.visaApplication.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mastek.visaApplication.entities.DNADatabase;

public interface DNADatabaseDAO extends MongoRepository<DNADatabase, Integer>{

	
}
