package com.amdocs.example.polymorphicbeans.implementation;

import com.amdocs.example.polymorphicbeans.interfaces.IByTypeService;

public class Type3Service implements IByTypeService {

//	private IByTypeService type2Service;
//	
//	public Type3Service(IByTypeService type2Service) {
//		this.type2Service = type2Service;
//	}

	@Override
	public String execute() {
		return "Type3";
	}

}
