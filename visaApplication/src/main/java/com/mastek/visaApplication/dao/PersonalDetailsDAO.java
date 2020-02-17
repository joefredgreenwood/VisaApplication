package com.mastek.visaApplication.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.visaApplication.entities.PersonalDetails;

public interface PersonalDetailsDAO extends
										CrudRepository<PersonalDetails, Double>{

}
