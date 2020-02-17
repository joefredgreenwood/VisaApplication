package com.mastek.visaApplication.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.visaApplication.entities.Payment;




@Repository
public interface PaymentDAO extends CrudRepository<Payment, Integer>{

}
