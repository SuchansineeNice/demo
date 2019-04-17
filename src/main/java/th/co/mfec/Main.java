package th.co.mfec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Main extends SpringBootServletInitializer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// TODO Auto-generated method stub
		return application.sources(mainClass);
	}
	
	private static Class<Main> mainClass = Main.class;
}
