package com.pairlearning.expensetrackerapiMaven;

import com.pairlearning.expensetrackerapiMaven.filters.AuthFilter;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@SpringBootApplication
public class ExpenseTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApiApplication.class, args);
	}


	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter(){
		// handling cors errors
		FilterRegistrationBean<CorsFilter> registrationBean=new FilterRegistrationBean<>();
		UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
		CorsConfiguration config=new CorsConfiguration();
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		source.registerCorsConfiguration("/**",config);
		registrationBean.setFilter(new CorsFilter());
		registrationBean.setOrder(0);
		return registrationBean;
	}
	@Bean
	public FilterRegistrationBean<AuthFilter> filterFilterRegistrationBean(){
     FilterRegistrationBean<AuthFilter> registrationBean=new FilterRegistrationBean<>();
	 AuthFilter authFilter=new AuthFilter();
	 registrationBean.setFilter(authFilter);
	 // for protected path
		registrationBean.addUrlPatterns("/api/categories/*");
		return registrationBean;
	}
}
