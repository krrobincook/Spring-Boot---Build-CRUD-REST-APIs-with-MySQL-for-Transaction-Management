package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

public class SpringBootTransactionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTransactionDemoApplication.class, args);
	}

}
