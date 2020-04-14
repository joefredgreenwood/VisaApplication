package com.mastek.visaApplication.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;
import com.mastek.visaApplication.entities.ApplicationForm;
import com.mastek.visaApplication.entities.PersonalDetails;


@Component
public class ApplicationDecisionServices {

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
	
	@Autowired
	PersonalDecisionServices perS;
	


	
	public int  terrorTest( ApplicationForm appForm) {

		int terror = 0;

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




		


		return terror;

	}


	public int testTravelHistory(ApplicationForm appForm) {

		int travel = 0;
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
		 int immigration = 0;
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

	@Scheduled(fixedRate=60000)
	@Transactional
	public String overallDecision() {
		
		String decision = "";
		
		Iterable<ApplicationForm> apps = appDAO.findByStatus("in progress");
		for (ApplicationForm appF:apps) {
			
				int perD = appF.getApplicationLink().getPassportNo();
				PersonalDetails perd = perddao.findById(perD).get();
				String mongoDecision = perS.mongoDecision(perd);
				
				int terror = terrorTest(appF);
				int travel = testTravelHistory(appF);
				int immigration = immgrationTest(appF);

		if (mongoDecision == "Application has passed DNA Screening") {

		if (terror>0) {
			decision = "Application denied in relation to terrorism";
		}
		else if (travel>4) {
			decision = "Application denied in relation to previous travel history";
		}
		else if (immigration>2) {
			decision = "Application denied dueto immigration";
		}
		else if (travel>0 && travel<4) {
			decision = "Application is under review due to applicants travel history";
		}
		else if (immigration>0 && immigration<2) {
			decision = "Application is under review due to applicant immigration history";
		}
		else {decision = "Visa granted";}
		
		
		appF.setStatus("complete");
		appF.setAppQuestionsStatus(decision);
		appDAO.save(appF);
		}
		else {
			
			appF.setAppQuestionsStatus(mongoDecision);
			appDAO.save(appF);
			
		}
		appF.setStatus("complete");
		perd.setDnaDatabaseScreeningStatus(mongoDecision);
		perddao.save(perd);

	}
		return decision;
	
}}
