package com.mastek.visaApplication.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.entities.DNADatabase;
import com.mastek.visaApplication.entities.PersonalDetails;

//@Component
public class PersonalDetailsServices {
/*	
	@Autowired
	ApplicationFormDAO appDAO;

	@Autowired
	DNADatabaseDAO dnaDAO;
	
	
	String crimeDate1;
	String crimeReason;
	boolean answer;

	public String getCrimeDate1() {
		return crimeDate1;
	}

	public void setCrimeDate1(String crimeDate1) {
		this.crimeDate1 = crimeDate1;
	}

	//Method that we will use to get current date
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
	public static Instant getDateFromString(String string) ////////////////
	{
		Instant timeStamp = null;
		timeStamp=Instant.parse(string);
		return timeStamp;
	}
	
	public String mongoDecision(PersonalDetails per) {
		DNADatabase db =dnaDAO.findById(per.getPassportNo()).get();
		if(db!=null) {
			crimeDate1 = db.getCrimeDate();
			
			answer = inLast10Years(crimeDate1);
			if (answer) {
				crimeReason = db.getCrimeDescription();
				return crimeReason;
			}
			else crimeReason = null;
			return crimeReason;
			
		}

		else crimeReason = null;
		return crimeReason;

	}*/
	/*public boolean main(String[]args) ////////////////////
	{

		String exampledate = crimeDate1;
		boolean Date1 = inLast10Years(exampledate);
		System.out.println(inLast10Years(exampledate)); 
		return Date1; //make call from method
		}*/
	

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	

}
