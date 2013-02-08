package de.jardas.rcp.module1.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.jardas.rcp.module1.api.Module1Service;

@Configuration
public class Module1Config {
	@Bean
	public Module1Service module1Service() {
		return new Module1ServiceImpl();
	}
}
