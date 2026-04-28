package Project.ALMXN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AlmxnApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlmxnApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<org.h2.server.web.JakartaWebServlet> h2servletRegistration() {
		ServletRegistrationBean<org.h2.server.web.JakartaWebServlet> registrationBean =
				new ServletRegistrationBean<>(new org.h2.server.web.JakartaWebServlet());
		registrationBean.addUrlMappings("/h2-console/*");
		return registrationBean;
	}
}