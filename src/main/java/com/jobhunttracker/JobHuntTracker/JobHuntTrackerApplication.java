package com.jobhunttracker.JobHuntTracker;

import com.jobhunttracker.JobHuntTracker.classes.User;
import com.jobhunttracker.JobHuntTracker.classes.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.ConfigurableEnvironment;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

@SpringBootApplication
public class JobHuntTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobHuntTrackerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository){
		return args -> {
			User user = new User("username", "example@email.com", "password");

			repository.insert(user);
		};
	}
	@EventListener
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
	}

}
