package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		int i = 10;
		SpringApplication.run(Application.class, args);
		int j = 20;
		System.out.println(i);
		int k = 30;
		System.out.println(j);
		char gender = 'F';
		int age = 20;
		boolean isSaved = false;
		boolean isUpdated = true;
		String name = "sushma";
		double price = 123.90;

	}

}
