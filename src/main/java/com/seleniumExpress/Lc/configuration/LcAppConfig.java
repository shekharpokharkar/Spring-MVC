package com.seleniumExpress.Lc.configuration;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.seleniumExpress.Lc.Formatter.AmountFormatter;
import com.seleniumExpress.Lc.Formatter.CreditCardFormatter;
import com.seleniumExpress.Lc.Formatter.PhoneNumberFormatter;

import jakarta.validation.Validator;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.seleniumExpress.Lc" })
@PropertySource("classpath:Email.properties")
public class LcAppConfig implements WebMvcConfigurer {

	Logger logger = Logger.getLogger(LcAppConfig.class.getName());

	@Autowired
	private Environment env;

	@Bean
	public InternalResourceViewResolver ViewResolver() {
		InternalResourceViewResolver ViewResolver = new InternalResourceViewResolver();
		ViewResolver.setPrefix("/WEB-INF/view/");
		ViewResolver.setSuffix(".jsp");

		return ViewResolver;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new PhoneNumberFormatter());
		registry.addFormatter(new CreditCardFormatter());
		registry.addFormatter(new AmountFormatter());
	}

	/*
	 * @Bean public ResourceBundleMessageSource messageSource() {
	 * ResourceBundleMessageSource msg = new ResourceBundleMessageSource();
	 * msg.setBasename("Message"); return msg; }
	 * 
	 * @Bean public LocalValidatorFactoryBean validator() {
	 * LocalValidatorFactoryBean validator1 = new LocalValidatorFactoryBean();
	 * validator1.setValidationMessageSource(messageSource()); return validator1; }
	 * 
	 * 
	 * 
	 * @Override public org.springframework.validation.Validator getValidator() {
	 * 
	 * return validator(); }
	 */
	@Bean
	public JavaMailSender configureJavaMailSender() {

		JavaMailSenderImpl sender = new JavaMailSenderImpl();

		sender.setHost(env.getProperty("Email.host"));
		sender.setUsername(env.getProperty("Email.userName"));
		sender.setPassword(env.getProperty("Email.password"));
		sender.setPort(covertNumberToString("Emai1.port"));

		getMailProperties(sender);

		return sender;
	}

	private int covertNumberToString(String name) {
		logger.info("Name:" + name);
		String port = env.getProperty(name);
		return Integer.parseInt(port);
	}

	private void getMailProperties(JavaMailSenderImpl sender) {
		Properties mailproperies = new Properties();
		mailproperies.put("mail.smtp.starttls.enable", true);
		mailproperies.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		sender.setJavaMailProperties(mailproperies);
	}
}
