package com.mastek.visaApplication.services;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.transaction.Transactional;

import org.bson.Document;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;


import com.mastek.visaApplication.dao.ApplicationFormDAO;

import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.dao.IssueingAuthorityDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;

import com.mastek.visaApplication.dao.DNADatabaseDAO;

import com.mastek.visaApplication.entities.ApplicationForm;

import com.mastek.visaApplication.entities.Countries;
import com.mastek.visaApplication.entities.Languages;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.entities.PersonalDetails;

import com.mastek.visaApplication.entities.DNADatabase;
import com.mastek.visaApplication.entities.PersonalDetails;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


@Component
public class VisaApplicationServices {


	
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
	IssueingAuthorityDAO issAuthDAO;

	

	@Autowired
	DNADatabaseDAO dnaDAO;

	int terror;
	int travel;
	int immigration;
	String decision;
	int year;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	String crimeDate1;
	String crimeReason;
	String crimeDate2;
	String crimeReason1;
	
	
	
	public String getCrimeDate2() {
		return crimeDate2;
	}

	public void setCrimeDate2(String crimeDate2) {
		this.crimeDate2 = crimeDate2;
	}

	public String getCrimeReason1() {
		return crimeReason1;
	}

	public void setCrimeReason1(String crimeReason1) {
		this.crimeReason1 = crimeReason1;
	}

	
	
	
	
	public String getCrimeReason() {
		return crimeReason;
	}

	public void setCrimeReason(String crimeReason) {
		this.crimeReason = crimeReason;
	}

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
	
	@Transactional
	public String mongoDecisionPersonal(PersonalDetails per) {
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

	}
	
	@Transactional
	public String mongoDecisionDependant(PersonalDetails per) {
		DNADatabase db1 =dnaDAO.findById(per.getDependantPassportNo()).get();
		if(db1!=null) {
			crimeDate2 = db1.getCrimeDate();
			
			answer = inLast10Years(crimeDate2);
			if (answer) {
				crimeReason1 = "Crime "+db1.getCrimeDescription();
				return crimeReason1;
			}
			else crimeReason1 = null;
			return crimeReason1;
			
		}

		else crimeReason1 = null;
		return crimeReason1;

	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Transactional
	public int  terrorTest( ApplicationForm appForm) {



		terror = 0;

		if (appForm.getHaveYouBeenAMemberOfTerroristOrginisation()) {
			++terror;
		}

		if (appForm.getHaveYouJustifiedOrEncouragedTerrorism()) {
			++terror;
		}

		if (appForm.getHaveYouSupportedTerrorism()) {
			++terror;
		}
		if (appForm.getHaveYouBeenSuspectedOrInvolvedInWarCrimes()) {
			++terror;
		}
		if (appForm.getAnyOtherActivitiesShowNotGoodPerson()) {
			++terror;
		}
		if (appForm.getWorkedForOrginisationDangerousToUKOrAllies()) {
			++terror;
		}
		if (appForm.getHaveYouExpressedAnyExtremistViews()) {
			++terror;
		}




		if (terror>0) {
			System.out.println("Your application has been denied due to terrorism links");	
		}



		return terror;

	}

	@Transactional
	public int testTravelHistory(ApplicationForm appForm) {

		travel = 0;
		if (appForm.getRefusedVisa()) {
			++travel;
		}
		if (appForm.getRefusedEntryAtBorder()) {
			++travel;
		}
		if (appForm.getRefusedPermissionToStay()) {
			++travel;
		}
		if (appForm.getRefusedAsylum()) {
			++travel;
		}
		if (appForm.getDeportedFromCountry()) {
			++travel;
		}
		if (appForm.getRemovedFromCountry()) {
			++travel;
		}
		if (appForm.getExcludedOrBannedFromEntry()) {
			++travel;
		}
		if (appForm.getHaveYouBreachedVisaConditions()) {
			++travel;
		}

		return travel;

	}

	@Transactional
	public int immgrationTest(ApplicationForm appForm) {
		immigration = 0;
		if (appForm.getHaveYouEnteredUKIllegally()) {
			++immigration;
		}
		if (appForm.getHaveYouStayedBeyondYourVisa()) {
			++immigration;
		}
		if (appForm.getHaveYouBreachedVisaConditions()) {
			++immigration;
		}
		if (appForm.getHaveYouReceivedPublicFundsWithoutPermission()) {
			++immigration;
		}
		if (appForm.getHaveYouGivenFalseInfoOnVisa()) {
			++immigration;
		}

		return immigration;
	}


	@Transactional
	public String overallDecision(ApplicationForm appForm, PersonalDetails per) {


		if (terror>0) {
			setDecision("Application denied in relation to terrorism");
		}
		else if(crimeReason!=null) {
			setDecision("Application denied due to previous crime - "+crimeReason);
		}
		else if(crimeReason1!=null) {
			setDecision("Application denied due to dependants previous crime - "+crimeReason1);
		}
		else if (travel>4) {
			setDecision("Application denied in relation to previous travel history");
		}
		else if (immigration>2) {
			setDecision("Application denied dueto immigration");
		}
		else if (travel>0 && travel<4) {
			setDecision("Application is under review due to applicants travel history");
		}
		else if (immigration>0 && immigration<2) {
			setDecision("Application is under review due to applicant immigration history");
		}
		else {setDecision("Visa granted");}

		return getDecision();

	}

	@Transactional
	public  void  DecisionMaker(ApplicationForm appF, PersonalDetails per) {
		terrorTest(appF);
		testTravelHistory(appF);
		immgrationTest(appF);
		mongoDecisionPersonal(per);
		mongoDecisionDependant(per);
		overallDecision(appF, per);


	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



	







	

@Transactional
public Payment assignPaymentToPersonalDetails(int passportNo, int paymentNo) {
Payment pay = payDAO.findById(paymentNo).get();
PersonalDetails perd = perddao.findById(passportNo).get();

pay.setPaymentLink(perd);
perd.getPaymentHistory().add(pay);
	perddao.save(perd);
	payDAO.save(pay);
	
	return pay;
}

@Transactional
public ApplicationForm assignApplicationToPersonalDetails(int passportNo, int applicationNo) {
ApplicationForm app = appFormDAO.findById(applicationNo).get();
PersonalDetails perd = perddao.findById(passportNo).get();

app.setApplicationLink(perd);
perd.getApplicationHistory().add(app);
	perddao.save(perd);
	appFormDAO.save(app);
	
	return app;
}

@Transactional
public PersonalDetails assignNationalityToPersonalDetails(int passportNo, int countryNo) {
Countries cou = couDAO.findById(countryNo).get();
PersonalDetails perd = perddao.findById(passportNo).get();

perd.setNationalityLink(cou);
cou.getNationalityHistory().add(perd);
	perddao.save(perd);
	couDAO.save(cou);
	
	return perd;
}

@Transactional
public PersonalDetails assignBirthPlaceToPersonalDetails(int passportNo, int countryNo) {
Countries cou = couDAO.findById(countryNo).get();
PersonalDetails perd = perddao.findById(passportNo).get();

perd.setBirthPlaceLink(cou);
cou.getBirthPlaceHistory().add(perd);
	perddao.save(perd);
	couDAO.save(cou);
	
	return perd;
}

@Transactional
public PersonalDetails assignLanguageToPersonalDetails(int passportNo, int languageNo) {
Languages lan = lanDAO.findById(languageNo).get();
PersonalDetails perd = perddao.findById(passportNo).get();

perd.setLanguageLink(lan);
lan.getLanguageHistory().add(perd);
	perddao.save(perd);
	lanDAO.save(lan);
	
	return perd;
}

@Transactional
public ApplicationForm assignApplicationFormToCountry(int applicationNo, int countryNo) {
Countries cou = couDAO.findById(countryNo).get();
ApplicationForm appfor = appFormDAO.findById(applicationNo).get();

appfor.getCountryVisitedAssigned().add(cou);
	appFormDAO.save(appfor);
	couDAO.save(cou);
	
	return appfor;
}
}

































