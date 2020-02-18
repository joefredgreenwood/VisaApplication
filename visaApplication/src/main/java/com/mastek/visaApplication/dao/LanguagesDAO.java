package com.mastek.visaApplication.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mastek.visaApplication.entities.Languages;


@Repository
public interface LanguagesDAO extends CrudRepository<Languages, Integer>{



}
