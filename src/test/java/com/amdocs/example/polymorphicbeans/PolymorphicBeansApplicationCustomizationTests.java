package com.amdocs.example.polymorphicbeans;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.amdocs.example.polymorphicbeans.interfaces.IMyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PolymorphicBeansApplicationCustomizationTests {

	@Autowired
	IMyService myService;
	
	@Test
	public void canLoadContextFromCustomization() {
	}

	@Test
	public void canLoadServiceBeanFromCustomization() {
		assertNotNull(myService);
	}
	
	@Test
	public void canCallServiceWithCoreType1FromCustomization() {
		String type = myService.DoByType("Type1");
		
		assertEquals("Type1", type);
	}
	
	@Test
	public void canCallServiceWithCustomizationType3() {
		String type = myService.DoByType("Type3");
		
		assertEquals("Type3", type);
	}
}
