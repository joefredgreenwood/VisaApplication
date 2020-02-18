package com.mastek.visaApplication.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.visaApplication.entities.IssueingAuthority;


@Repository
public interface IssueingAuthorityDAO extends CrudRepository<IssueingAuthority, Integer>{

}







