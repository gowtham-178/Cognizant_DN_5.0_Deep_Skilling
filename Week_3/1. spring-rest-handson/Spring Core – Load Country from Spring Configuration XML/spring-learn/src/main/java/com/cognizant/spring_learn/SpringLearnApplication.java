package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class SpringLearnApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void displayCountry(){

		logger.info("Entered displayCountry method");

		//The bean for country is created here
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("country", Country.class);
		logger.info("Country : {}", country);
		logger.info("Exiting displayCountry method");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
	}

}
