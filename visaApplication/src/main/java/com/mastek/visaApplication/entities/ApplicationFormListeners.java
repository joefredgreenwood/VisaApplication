package com.mastek.visaApplication.entities;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.persister.entity.EntityPersister;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.services.VisaApplicationServices;


@Component
public class ApplicationFormListeners implements ApplicationContextAware{

	VisaApplicationServices visaApp;
	ApplicationContext context;
	ApplicationFormDAO appdao;
	
	
	
	
	
	public ApplicationFormDAO getAppdao() {
		appdao = context.getBean(ApplicationFormDAO.class);
		return appdao;
	}

	public void setAppdao(ApplicationFormDAO appdao) {
		this.appdao = appdao;
	}

	@PrePersist
	public void preInsert(ApplicationForm app) {
		System.out.println("Start add");
	}

	public VisaApplicationServices getVisaApp() {
		visaApp = context.getBean(VisaApplicationServices.class);
		return visaApp;
	}


	public void setVisaApp(VisaApplicationServices visaApp) {
		this.visaApp = visaApp;
	}


//	@PostPersist
//	public void afterInsert (ApplicationForm app) {
//		getVisaApp();
//		visaApp.terrorTest(app);
//		visaApp.immgrationTest(app);
//		visaApp.testTravelHistory(app);
//		visaApp.overallDecision(app);
//		visaApp.DecisionMaker(app);
//		app.setAppQuestionsStatus(visaApp.DecisionMaker(app));
//		System.out.println(visaApp.DecisionMaker(app));
////		appdao.save(app);
		
		
		

//	}



	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context= applicationContext;
	}

	








}
