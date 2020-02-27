package com.cg.service;

import java.util.HashMap;

import com.cg.dao.RawMaterialDao;
import com.cg.dao.RawMatrialDaoImpl;
import com.cg.exception.orderNotFoundException;
import com.cg.main.RawMaterialStock;

public class RawMaterialServiceImpl implements RawMaterialService{
	RawMaterialDao dao=new RawMatrialDaoImpl();
	

	@Override
	public RawMaterialStock trackProductOrder(String id) throws orderNotFoundException {
		// TODO Auto-generated method stub
		return dao.trackProductOrder(id);
	}

	public RawMaterialServiceImpl() {
	
	}

	@Override
	public boolean doesProductOrderIdExists(String id) {
		// TODO Auto-generated method stub
		return dao.doesProductOrderIdExists(id);
	}

	@Override
	public boolean updateExitDateinCheck(String date, RawMaterialStock productStock) {
		// TODO Auto-generated method stub
		return dao.updateExitDateinCheck(date, productStock);
	}

	@Override
	public boolean validateExpiryDate(String id) {
		// TODO Auto-generated method stub
		return dao.validateExpiryDate(id);
	}

	@Override
	public boolean updateProductStock(RawMaterialStock productStock) {
		// TODO Auto-generated method stub
		return dao.updateProductStock(productStock);
	}

	@Override
	public boolean updateStatus(String id, String status) {
		// TODO Auto-generated method stub
		return dao.updateStatus(id, status);
	}

	@Override
	public HashMap<String, RawMaterialStock> getMap() {
		// TODO Auto-generated method stub
		return dao.getMap();
	}

	@Override
	public void setMap(HashMap<String, RawMaterialStock> daoMap) {
		// TODO Auto-generated method stub
		dao.setMap(daoMap);
	}
	

}
