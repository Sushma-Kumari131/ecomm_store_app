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
		double price = 123.90;
	}

}
