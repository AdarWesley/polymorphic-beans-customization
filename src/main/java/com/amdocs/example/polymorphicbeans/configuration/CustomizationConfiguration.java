package com.amdocs.example.polymorphicbeans.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amdocs.example.polymorphicbeans.implementation.Type1Service;
import com.amdocs.example.polymorphicbeans.implementation.Type3Service;
import com.amdocs.example.polymorphicbeans.interfaces.IByTypeService;

@Configuration
public class CustomizationConfiguration {
	
	@Bean
	@Qualifier("Type3")
	IByTypeService type3Service() {
		return new Type3Service();
	}
	
	
}
