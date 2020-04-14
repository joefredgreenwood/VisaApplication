package com.mastek.visaApplication.entities;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.mastek.visaApplication.services.VisaApplicationServices;

@Component
public class PersonalDetailsListener implements ApplicationContextAware {


	VisaApplicationServices visaApp;
	ApplicationContext context;

	public VisaApplicationServices getVisaApp() {
		visaApp = context.getBean(VisaApplicationServices.class);
		return visaApp;
	}


	public void setVisaApp(VisaApplicationServices visaApp) {
		this.visaApp = visaApp;
	}


/*@PostPersist
	public void afterInsertPer (PersonalDetails per) {
		getVisaApp();
		System.out.println(visaApp.mongoDecisionMaker(per));
		
		//visaApp.mongoDecisionMaker(per);
		//System.out.println(visaApp.getMongoDecisionV());
	
	}*/


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context= applicationContext;
	}

}
