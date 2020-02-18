package com.mastek.visaApplication.services;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.entities.ApplicationForm;

@Component
public class VisaApplicationServices {

	@Autowired
	ApplicationFormDAO appDAO;

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




}













