package com.mastek.visaApplication.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;
import com.mastek.visaApplication.entities.DNADatabase;
import com.mastek.visaApplication.entities.PersonalDetails;

@Component
public class PersonalDecisionServices {
	
	@Autowired
	DNADatabaseDAO dnadao;


	@Autowired
	PaymentDAO payDAO;


	@Autowired
	PersonalDetailsDAO perddao;

	@Autowired
	ApplicationFormDAO appFormDAO;

	@Autowired
	CountriesDAO couDAO;

	@Autowired
	LanguagesDAO lanDAO;

	@Autowired
	ApplicationFormDAO appDAO;

	@Autowired
	DNADatabaseDAO dnaDAO;
	
	
	

	public static boolean inLast10Years(String Date) {
		double years = 0;
		try {            
			Date date = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss").parse(Date); //convert DB date from string to Date object
			Date currentDate = new Date(); //gets current date 

			long diffMil = currentDate.getTime() - date.getTime(); //get miliseconds between dates
			long days = TimeUnit.MILLISECONDS.toDays(diffMil); //get days between dates
			years = days / 365.25; //gets years between dates
			// so meantion conflict in timezones between data in database and what we have in here
			//may not be an issue * 

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return years <= 10;
	}
	@Transactional
	public static Instant getDateFromString(String string) ////////////////
	{
		Instant timeStamp = null;
		timeStamp=Instant.parse(string);
		return timeStamp;
	}

	@Transactional
	public String mongoDecisionPersonal(PersonalDetails per) {
		DNADatabase db2;
		String crimeReason;
		try {
			db2 =dnaDAO.findById(per.getPassportNo()).get();
			if(db2!=null) {
				String crimeDate1 = db2.getCrimeDate();

				boolean answer = inLast10Years(crimeDate1);
				if (answer) {
					crimeReason = db2.getCrimeDescription();
					
				}
				else crimeReason = null;
				

			}

			else {crimeReason = null;
						}
			
		} catch (Exception e) {
			crimeReason = null;
		}
		return crimeReason;
	}

	@Transactional
	public String mongoDecisionDependant(PersonalDetails per) {
		DNADatabase db1;
		String crimeReason1;
	
		
		try {
			db1 = dnaDAO.findById(per.getDependantPassportNo()).get();

			if(db1!=null) {
				String crimeDate2 = db1.getCrimeDate();

				boolean answer = inLast10Years(crimeDate2);
				if (answer) {
					crimeReason1 = db1.getCrimeDescription();

				}
				else {crimeReason1 = null;
				}

			}

			else {crimeReason1 = null;

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			crimeReason1 = null;
		}
		return crimeReason1;
	}



		@Transactional
	public String mongoDecision (PersonalDetails per) {
			
			String mongoDecisionV;
			String crimeReason = mongoDecisionPersonal(per);
			String crimeReason1 = mongoDecisionDependant(per);

		if (crimeReason!=null) {
			mongoDecisionV = "Application denied as name appears in DNA Database for crime "+crimeReason;
			
		}
		else if (crimeReason1!=null) {
			mongoDecisionV = "Application denied as Dependant's name appears in DNA Database for crime "+crimeReason1;
			
		}
		else {mongoDecisionV = "Application has passed DNA Screening";
		}
		per.setDnaDatabaseScreeningStatus(mongoDecisionV);
		perddao.save(per);
		return mongoDecisionV;
	}




}
