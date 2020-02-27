package com.cg.dao;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.cg.main.RawMaterialStock;

public class Test {
	private static RawMatrialDaoImpl rdi;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		rdi=new RawMatrialDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@org.junit.Test
	public void doesProductOrderIdExiststest() {
		boolean val=rdi.doesProductOrderIdExists("001");
		assertTrue(val);
		
	}

@org.junit.Test
 public void validateExpiryDatetest() {
	boolean val=rdi.validateExpiryDate("008");
	assertTrue(val);
}
 
@org.junit.Test
public void getMaptest() {
	HashMap<String, RawMaterialStock> val=rdi.getMap();
	assertNotNull(val);
}


}
