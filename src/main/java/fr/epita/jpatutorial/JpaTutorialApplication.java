package fr.epita.jpatutorial;

import fr.epita.jpatutorial.repositories.MotoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaTutorialApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(JpaTutorialApplication.class);

    @Autowired
    MotoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaTutorialApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // TODO : do some stuff here
    }
}

