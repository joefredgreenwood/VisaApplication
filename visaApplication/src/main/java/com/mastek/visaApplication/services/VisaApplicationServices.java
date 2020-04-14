package com.mastek.visaApplication.services;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.transaction.Transactional;

import org.bson.Document;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;


import com.mastek.visaApplication.api.ApplicationFormAPI;
import com.mastek.visaApplication.api.CountriesAPI;

import com.mastek.visaApplication.api.LanguagesAPI;
import com.mastek.visaApplication.api.PaymentAPI;
import com.mastek.visaApplication.api.PersonalDetailsAPI;

import com.mastek.visaApplication.dao.ApplicationFormDAO;

import com.mastek.visaApplication.dao.CountriesDAO;


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

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


@Component
public class VisaApplicationServices implements PersonalDetailsAPI, ApplicationFormAPI, CountriesAPI, LanguagesAPI, PaymentAPI{



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

	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	////////////////////////////////////////////////////// For PersonsalDetails API
	@Override
	public Iterable<PersonalDetails> listAllPersonalDetails() {
		System.out.println("Listing All Personal Details");
		return perddao.findAll();
	}

	@Override
	public PersonalDetails findByPassportNo(int passportNo) {


		return perddao.findById(passportNo).get();
	}


	@Override
	public PersonalDetails registerNewPersonalDetails(PersonalDetails newPersonalDetails) {
		newPersonalDetails = perddao.save(newPersonalDetails);
		return newPersonalDetails;
	}

	///////////////////////////////////////////////// For ApplicationFormAPI
	@Override
	public Iterable<ApplicationForm> listAllApplicationForms() {
		System.out.println("Listing All Application Forms");
		return appDAO.findAll();
	}

	@Override
	public ApplicationForm findByApplicationID(int applicationID) {

		return appDAO.findById(applicationID).get();
	}

	@Override
	public ApplicationForm registerNewApplicationForm(ApplicationForm newApplicationForm) {
		LocalDate currentDate = LocalDate.now();
		String cDate = currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		newApplicationForm.setApplicationDate(cDate);
		newApplicationForm.setAppQuestionsStatus("Application in progress");
		newApplicationForm.setStatus("in progress");		
		newApplicationForm = appDAO.save(newApplicationForm);
		return newApplicationForm;
	}

	/////////////////////////////////////////////////////////For CountriesAPI
	@Override
	public Iterable<Countries> listAllCountries() {
		System.out.println("Listing All Countries");
		return couDAO.findAll();
	}

	@Override
	public Countries findByCountryId(int countryId) {

		return couDAO.findById(countryId).get();
	}

//////////////////////////////////////////////////////////For IssueingAuthorityAPI
//@Override
//public Iterable<IssueingAuthority> listAllIssueingAuthorities() {
//	System.out.println("Listing All Issueing Authorities");
//	return issAuthDAO.findAll();
//}
//
//@Override
//public IssueingAuthority findByIssueingAuthorityId(int issueingAuthorityId) {
//	
//	return issAuthDAO.findById(issueingAuthorityId).get();
//	
//}
//
//@Override
//public IssueingAuthority registerNewIssueingAuthority(IssueingAuthority newIssueingAuthority) {
//	newIssueingAuthority = issAuthDAO.save(newIssueingAuthority);
//	return newIssueingAuthority;
//}
//////////////////////////////////////////////////////////////////////LanguagesAPI



//////////////////////////////////////////////////////////For IssueingAuthorityAPI
//@Override
//public Iterable<IssueingAuthority> listAllIssueingAuthorities() {
//	System.out.println("Listing All Issueing Authorities");
//	return issAuthDAO.findAll();
//}
//
//@Override
//public IssueingAuthority findByIssueingAuthorityId(int issueingAuthorityId) {
//	
//	return issAuthDAO.findById(issueingAuthorityId).get();
//	
//}
//
//@Override
//public IssueingAuthority registerNewIssueingAuthority(IssueingAuthority newIssueingAuthority) {
//	newIssueingAuthority = issAuthDAO.save(newIssueingAuthority);
//	return newIssueingAuthority;
//    }

	@Override
	public Countries registerNewCountry(Countries newCountry) {
		newCountry = couDAO.save(newCountry);
		return newCountry;
	}


	//////////////////////////////////////////////////////////For IssueingAuthorityAPI
//	@Override
//	public Iterable<IssueingAuthority> listAllIssueingAuthorities() {
//		System.out.println("Listing All Issueing Authorities");
//		return issAuthDAO.findAll();
//	}
//
//	@Override
//	public IssueingAuthority findByIssueingAuthorityId(int issueingAuthorityId) {
//
//
//		return issAuthDAO.findById(issueingAuthorityId).get();
//
//	}
//
//	@Override
//	public IssueingAuthority registerNewIssueingAuthority(IssueingAuthority newIssueingAuthority) {
//		newIssueingAuthority = issAuthDAO.save(newIssueingAuthority);
//		return newIssueingAuthority;
//	}

	//////////////////////////////////////////////////////////////////////LanguagesAPI
	@Override
	public Iterable<Languages> listAllLanguages() {
		System.out.println("Listing All Languages");
		return lanDAO.findAll();
	}

	@Override
	public Languages findByLanguageId(int languageId) {

		return lanDAO.findById(languageId).get();
	}

	@Override
	public Languages registerNewLanguages(Languages newLanguage) {
		newLanguage = lanDAO.save(newLanguage);
		return newLanguage;
	}

	/////////////////////////////////////////////////////////////PaymentAPI
	@Override
	public Iterable<Payment> listAllPayments() {
		System.out.println("Listing All Payments");
		return payDAO.findAll();
	}

	@Override
	public Payment findByPaymentRef(int paymentRef) {

		return payDAO.findById(paymentRef).get();
	}

	@Override
	public Payment registerNewPayment(Payment newPayment) {
		newPayment = payDAO.save(newPayment);
		return newPayment;
	}


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
	@Override
	@Transactional
	public Set<ApplicationForm> getPersonalApplications(int passportNo) {
		PersonalDetails currentPer = perddao.findById(passportNo).get();
	    int count = currentPer.getApplicationHistory().size();
	    System.out.println(count +" Accounts found");
	    
	    Set<ApplicationForm> applicationForms = currentPer.getApplicationHistory();
	    return applicationForms;
	}

	
	@Override
	@Transactional
	public ApplicationForm registerApplicationFormForPersonalDetails(int passportNo, ApplicationForm newApplicationForm) {
		LocalDate currentDate = LocalDate.now();
		String cDate = currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		newApplicationForm.setApplicationDate(cDate);
		newApplicationForm.setAppQuestionsStatus("Application in progress");
		newApplicationForm.setStatus("in progress");
		newApplicationForm = appDAO.save(newApplicationForm);
		assignApplicationToPersonalDetails(passportNo, newApplicationForm.getApplicationID());
		return newApplicationForm;
	}

}

































