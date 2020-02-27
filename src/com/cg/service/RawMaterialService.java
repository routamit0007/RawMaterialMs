package com.cg.service;

import java.util.HashMap;

import com.cg.exception.orderNotFoundException;
import com.cg.main.RawMaterialStock;

public interface RawMaterialService {
	RawMaterialStock trackProductOrder(String id) throws orderNotFoundException;
	boolean doesProductOrderIdExists(String id);
	boolean updateExitDateinCheck(String date,RawMaterialStock productStock);
	boolean validateExpiryDate(String id);
	boolean updateProductStock(RawMaterialStock productStock);
	boolean updateStatus(String id,String status);
	HashMap<String, RawMaterialStock> getMap();
	void setMap(HashMap<String, RawMaterialStock> daoMap);
}
