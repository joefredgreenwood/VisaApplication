package com.mastek.visaApplication.services;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.dao.IssueingAuthorityDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;
import com.mastek.visaApplication.entities.ApplicationForm;
import com.mastek.visaApplication.entities.Countries;
import com.mastek.visaApplication.entities.Languages;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.entities.PersonalDetails;

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













