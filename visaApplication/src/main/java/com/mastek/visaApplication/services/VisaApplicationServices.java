package com.mastek.visaApplication.services;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.visaApplication.api.ApplicationFormAPI;
import com.mastek.visaApplication.api.CountriesAPI;
import com.mastek.visaApplication.api.IssueingAuthorityAPI;
import com.mastek.visaApplication.api.LanguagesAPI;
import com.mastek.visaApplication.api.PaymentAPI;
import com.mastek.visaApplication.api.PersonalDetailsAPI;
import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.IssueingAuthorityDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;
import com.mastek.visaApplication.entities.ApplicationForm;
import com.mastek.visaApplication.entities.Countries;
import com.mastek.visaApplication.entities.IssueingAuthority;
import com.mastek.visaApplication.entities.Languages;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.entities.PersonalDetails;

@Component
public class VisaApplicationServices implements PersonalDetailsAPI, ApplicationFormAPI, CountriesAPI, IssueingAuthorityAPI, LanguagesAPI, PaymentAPI{

	@Autowired
	ApplicationFormDAO appDAO;
	
	@Autowired
	PersonalDetailsDAO perddao;
	
	@Autowired
	CountriesDAO couDAO;
	
	@Autowired
	IssueingAuthorityDAO issAuthDAO;
	
	@Autowired
	LanguagesDAO lanDAO;
	
	@Autowired
	PaymentDAO payDAO;

	int terror;
	int travel;
	int immigration;
	String decision;

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

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

public String overallDecision(ApplicationForm appForm) {
	
	
	if (terror>0) {
		setDecision("Application denied in relation to terrorism");;
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

@Override
public Countries registerNewCountry(Countries newCountry) {
	newCountry = couDAO.save(newCountry);
	return newCountry;
}

//////////////////////////////////////////////////////////For IssueingAuthorityAPI
@Override
public Iterable<IssueingAuthority> listAllIssueingAuthorities() {
	System.out.println("Listing All Issueing Authorities");
	return issAuthDAO.findAll();
}

@Override
public IssueingAuthority findByIssueingAuthorityId(int issueingAuthorityId) {
	
	return issAuthDAO.findById(issueingAuthorityId).get();
	
}

@Override
public IssueingAuthority registerNewIssueingAuthority(IssueingAuthority newIssueingAuthority) {
	newIssueingAuthority = issAuthDAO.save(newIssueingAuthority);
	return newIssueingAuthority;
}
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




}













