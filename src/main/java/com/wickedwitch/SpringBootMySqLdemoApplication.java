package com.wickedwitch;

import com.wickedwitch.service.EventServiceDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMySqLdemoApplication implements CommandLineRunner {

	/** The class logger */
	private static final Logger LOG = LoggerFactory.getLogger(SpringBootMySqLdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySqLdemoApplication.class, args);
	}

	@Autowired
	private EventServiceDB eventServiceDB;

	@Override
	public void run(String... args) throws Exception {
		LOG.info("START sql...");
		eventServiceDB.insertMySQLdata();
		LOG.info("FINISH sql...");
		LOG.info("findAll method");
		eventServiceDB.findAll().forEach(event -> LOG.info(event.toString()));
		LOG.info("findByName method");
		LOG.info(eventServiceDB.findByEventName("party1").toString());

	}
}
