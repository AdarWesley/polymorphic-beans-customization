package com.amdocs.example.polymorphicbeans.implementation;

import com.amdocs.example.polymorphicbeans.interfaces.IByTypeService;

public class Type4CustomizationService implements IByTypeService {

	IByTypeService coreService;
	
	public Type4CustomizationService(IByTypeService coreService) {
		this.coreService = coreService;
	}

	@Override
	public String execute() {
		return "Type4Customization " + coreService.execute();
	}

}
