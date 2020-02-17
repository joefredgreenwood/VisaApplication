package com.mastek.visaApplication.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.visaApplication.entities.PersonalDetails;

@Repository
public interface PersonalDetailsDAO extends
										CrudRepository<PersonalDetails, Double>{

}
