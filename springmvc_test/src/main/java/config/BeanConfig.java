package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import presentation.AnyController;

@Configuration
public class BeanConfig {
	@Bean
	public AnyController AnyControl( ) {
		return new AnyController( );
	}	
}
