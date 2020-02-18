package com.mastek.visaApplication.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.visaApplication.entities.ApplicationForm;

public interface ApplicationFormDAO extends CrudRepository<ApplicationForm, Integer> {

}
