package com.mastek.visaApplication.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.mastek.visaApplication.entities.DNADatabase;

public interface DNADatabaseDAO extends MongoRepository<DNADatabase, Integer>/*, QuerydslPredicateExecutor<DNADatabase>*/{

/*    @Query(value = "{crimeDate:?0}")
	List<DNADatabase> findByCrimeDate(String crimeDate);*/
}
