package uk.ac.belfastmet.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {
	
	static Logger log = LoggerFactory.getLogger(TodoApplication.class);

	public static void main(String[] args) {
		log.info("Application start, in TodoApplication.java");
		SpringApplication.run(TodoApplication.class, args);
	}

}
