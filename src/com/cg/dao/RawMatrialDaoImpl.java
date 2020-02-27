package com.cg.dao;

import java.util.HashMap;

import com.cg.exception.orderNotFoundException;
import com.cg.main.RawMaterialStock;

public class RawMatrialDaoImpl implements RawMaterialDao {
	HashMap<String,RawMaterialStock> map= new HashMap<>();
	private int day = 27;
	private int month = 2;
	private int year = 2020;
	
	
	public RawMatrialDaoImpl() {
		map.put("001", new RawMaterialStock("001","Mango ",10.0, 100.0, 20.0,
				200.0, "RM01", "24/02/2020", "21/01/2020", "28/02/2020"," Dispatched"
				));
			map.put("002", new RawMaterialStock("002","Banana ",03.0, 100.0, 30.0,
					90.0, "RM02", "24/02/2020", "21/02/2020", "27/02/2020","Delivered"
					));
			map.put("003", new RawMaterialStock("003","Grapes",8.0, 100.0, 25.0,
					100.0, "RM03", "28/02/2020", "24/02/2020", "03/03/2020","Dispatched"
					));
			map.put("004", new RawMaterialStock("004","Pineapple",70.0, 100.0, 13.0,
					910.0, "RM04", "01/03/2020", "27/02/2020", "05/03/2020","Not Dispatched"
					));
			map.put("005", new RawMaterialStock("005","Orange",15.0, 100.0, 25.0,
					375.0, "RM05", "25/02/2020", "23/02/2020", "29/02/2020","Delivered"
					));
			map.put("006", new RawMaterialStock("006","Sugar",1.0, 100.0, 40.0,
					40.0, "RMO6", "28/02/2020", "25/02/2020", "03/08/2020","Dispatched"
					));
			map.put("007", new RawMaterialStock("007","Ice",003.0, 100.0, 1000.0,
					300.0, "RMO7", "24/02/2020", "22/01/2020", "12/04/2020","Delivered"
					));
			map.put("008", new RawMaterialStock("008","Milk",20.0, 100.0, 20.0,
					400.0, "RM08", "26/02/2020", "26/02/2020", "28/03/2020","Not Dispatched"
					));
		
		
		
	}

	@Override
	public RawMaterialStock trackProductOrder(String id) throws orderNotFoundException {
		// TODO Auto-generated method stub
		RawMaterialStock res = map.get(id);
		if(res==null)throw new orderNotFoundException("Order not found");
		return res;
	}

	@Override
	public boolean doesProductOrderIdExists(String id) {
		if(map.get(id)==null)return false;
		return true;
	}

	@Override
	public boolean updateExitDateinCheck(String date, RawMaterialStock productStock) {
		RawMaterialStock prod =map.get(productStock.getOrderId());
		prod.setDeliveryDate(date);
		RawMaterialStock prodNew = map.put(productStock.getOrderId(),prod);
		return true;
	}

	@Override
	public boolean validateExpiryDate(String id) {
		RawMaterialStock  prod = map.get(id);
		String date = prod.getExpiryDate();
		//12/02/2020
		String arr[]=date.split("/");
		int exDay = Integer.parseInt(arr[0]);
		int exmon = Integer.parseInt(arr[1]);
		int exyear = Integer.parseInt(arr[2]);
		if(exyear>=year) {
			if(exmon>=month) {
				if(exDay>day) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean updateProductStock(RawMaterialStock productStock) {
		RawMaterialStock e = map.put(productStock.getOrderId(), productStock);
		//System.out.println(map);
		return true;
	}

	@Override
	public boolean updateStatus(String id, String status) {
		RawMaterialStock prod =map.get(id);
		prod.setStatus(status);
		RawMaterialStock prodNew = map.put(id,prod);
		return true;
	}
	@Override
	public HashMap<String, RawMaterialStock> getMap() {
		return map;
	}

	@Override
	public void setMap(HashMap<String, RawMaterialStock> daoMap) {
		// TODO Auto-generated method stub
		map=daoMap;
	}

}
