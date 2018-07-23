package com.amdocs.example.polymorphicbeans.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.amdocs.example.polymorphicbeans.implementation.Type3CustomizationService;
import com.amdocs.example.polymorphicbeans.implementation.Type4CustomizationService;
import com.amdocs.example.polymorphicbeans.interfaces.IByTypeService;

@Configuration
@Order(9)
public class CustomizationConfiguration {
	
	@Bean
	//@Qualifier("Type3")
	IByTypeService type3Service() {
		return new Type3CustomizationService();
	}
	
	@Bean
	@Qualifier("Type4")
	IByTypeService type4Service(@Qualifier("Type2") IByTypeService coreService) {
		return new Type4CustomizationService(coreService);
	}
	
	
}
