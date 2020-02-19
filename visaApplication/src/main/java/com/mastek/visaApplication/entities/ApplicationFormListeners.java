package com.mastek.visaApplication.entities;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.mastek.visaApplication.services.VisaApplicationServices;


@Component
public class ApplicationFormListeners implements ApplicationContextAware{
	
	VisaApplicationServices visaApp;
	ApplicationContext context;
	
	@PrePersist
	public void preInsert(ApplicationForm app) {
		System.out.println("Start add");
	}
	
	public VisaApplicationServices getVisaApp() {
		visaApp = context.getBean(VisaApplicationServices.class);
		return visaApp;
	}

/*
	public void setVisaApp(VisaApplicationServices visaApp) {
		this.visaApp = visaApp;
	}


	@PostPersist
	public void afterInsert (ApplicationForm app) {
		getVisaApp();
		System.out.println("Method called" + visaApp);
		visaApp.DecisionMaker(app);
		System.out.println(visaApp.getDecision());
	
	}
	*/
	

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context= applicationContext;
	}
	
	
	
	
	
	
	

}
