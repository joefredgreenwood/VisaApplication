package com.mastek.visaApplication.dao;

import javax.ws.rs.PathParam;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.visaApplication.entities.ApplicationForm;

@Repository
public interface ApplicationFormDAO extends CrudRepository<ApplicationForm, Integer>{
	
	Iterable<ApplicationForm> findByStatus(@PathParam("status")String status);


}
