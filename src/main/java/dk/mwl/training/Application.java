package dk.mwl.training;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public CommandLineRunner  cliRunner(@Value("${user.name}") String userName){
		return args -> System.out.println("Hello "+ userName);
		
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
