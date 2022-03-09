//package com.spring.config;
//
//import org.springframework.context.MessageSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ReloadableResourceBundleMessageSource;
//
//@Configuration
//public class MessageConfig {
//
//	@Bean("messageSource")
//	public MessageSource messageSource() {
//
//		ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
//		ms.setBasename("classpath:messages/user");
//		ms.setDefaultEncoding("UTF-8");
//
//		return ms;
//	}
//
//}