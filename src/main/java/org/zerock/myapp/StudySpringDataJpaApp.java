package org.zerock.myapp;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.Arrays;


//@Log4j2
@Slf4j

@NoArgsConstructor

@EntityScan

@ConfigurationPropertiesScan
@ServletComponentScan
@SpringBootApplication
public class StudySpringDataJpaApp extends ServletInitializer {


	public static void main(String[] args) {
		// -- 1st. method -----------
//		SpringApplication.run(StudySpringDataJpaApp.class, args);

		// -- 2nd. method -----------
		SpringApplication app = new SpringApplication(StudySpringDataJpaApp.class);

		app.setWebApplicationType(WebApplicationType.SERVLET);
//		app.setWebApplicationType(WebApplicationType.NONE);

		app.setBannerMode(Banner.Mode.CONSOLE);

//		app.run();
		app.run(args);

		log.trace("main({}) invoked.", Arrays.toString(args));
	} // main

} // end class

