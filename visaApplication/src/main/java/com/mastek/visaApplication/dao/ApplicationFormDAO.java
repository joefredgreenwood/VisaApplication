package com.mastek.visaApplication.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.visaApplication.entities.ApplicationForm;

@Repository
public interface ApplicationFormDAO extends CrudRepository<ApplicationForm, Integer>{


}
