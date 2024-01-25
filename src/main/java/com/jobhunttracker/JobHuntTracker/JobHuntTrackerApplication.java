package com.jobhunttracker.JobHuntTracker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.text.SimpleDateFormat;
import java.util.Date;
@SpringBootApplication @EnableMongoRepositories("com.jobhunttracker.JobHuntTracker.repository") @Slf4j
public class JobHuntTrackerApplication {
	public static void main(String[] args) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.setProperty("timestamp", dateFormat.format(new Date()));

		log.info("Starting JobHuntTrackerApplication...");
		try {
		SpringApplication.run(JobHuntTrackerApplication.class, args);
		log.info("JobHuntTrackerApplication started successfully.");
		} catch (Exception e) {
			log.error("Error occurred during application startup:", e);
			System.out.println(("Error occurred during application startup:" + e));
		}
	}





	/* @EventListener
	public void printProperties(ContextRefreshedEvent contextRefreshedEvent) {
		System.out.println("************************* ACTIVE PROPERTIES *************************");

		((ConfigurableEnvironment) contextRefreshedEvent.getApplicationContext().getEnvironment())
				.getPropertySources()
				.stream()
				.filter(ps -> ps instanceof OriginTrackedMapPropertySource)
				// Convert each PropertySource to its properties Set
				.map(ps -> ((OriginTrackedMapPropertySource) ps).getSource().entrySet())
				.flatMap(Collection::stream)
				// Print properties within each Set
				.forEach(property -> System.out.println(property.getKey() + "=" + property.getValue()));

		System.out.println("*********************************************************************");
	}*/


}
