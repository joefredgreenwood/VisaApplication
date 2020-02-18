package com.mastek.visaApplication.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.visaApplication.entities.Countries;




@Repository
public interface CountriesDAO extends CrudRepository<Countries, Integer>{

}
