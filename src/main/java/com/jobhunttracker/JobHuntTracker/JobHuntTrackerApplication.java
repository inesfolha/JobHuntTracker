package com.jobhunttracker.JobHuntTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@SpringBootApplication @EnableMongoRepositories("com.jobhunttracker.JobHuntTracker.repository")
public class JobHuntTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobHuntTrackerApplication.class, args);
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
