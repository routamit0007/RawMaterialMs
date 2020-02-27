package com.cg.main;

public class RawMaterialStock {
	private String orderId;
	private String name;
	private double price_per_unit;
	private double quantityValue;
	private double quantityUnit;
	private double price;
	private String warehouseID;
	private String deliveryDate;
	private String manufacturingDate;
	private String expiryDate;
	private String status;
	//private String qualityCheck;
	//private Date processDate;
	//ProductStock ps=new ProductStock();
	public RawMaterialStock(String orderId, String Name, double Price_per_unit, double QuantityValue, double QuantityUnit,
			double Price, String WarehouseID, String DeliveryDate, String ManufacturingDate, String ExpiryDate,String Status) {
		
		this.orderId = orderId;
		this.name = Name;
		this.price_per_unit = Price_per_unit;
		this.quantityValue = QuantityValue;
		this.quantityUnit = QuantityUnit;
		this.price = Price;
		this.warehouseID = WarehouseID;
		this.deliveryDate = DeliveryDate;
		this.manufacturingDate = ManufacturingDate;
		this.expiryDate = ExpiryDate;
		this.status=Status;
		//this.qualityCheck = qualityCheck;
		//this.processDate = processDate;
	}
	@Override
	public String toString() {
		return " \n OrderId=  " + orderId +" \n Name=" + name + " \n Price_per_unit=" + price_per_unit
				+ "\n QuantityValue=" + quantityValue + "\n QuantityUnit=" + quantityUnit + "\n Price=" + price
				+ "\n WarehouseID=" + warehouseID + " \n DeliveryDate=" + deliveryDate + "\n ManufacturingDate="
				+ manufacturingDate + "\n ExpiryDate=" + expiryDate + "\n Status=" + status;
	}
	public RawMaterialStock()
	{
		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getQuantityUnit() {
		return quantityUnit;
	}
	public double setQuantityUnit(double quantityUnit) {
		return this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWarehouseID() {
		return warehouseID;
	}
	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
//	public String getQualityCheck() {
//		return qualityCheck;
//	}
//	public void setQualityCheck(String qualityCheck) {
//		this.qualityCheck = qualityCheck;
//	}
//	public Date getProcessDate() {
//		return processDate;
//	}
//	public void setProcessDate(Date processDate) {
//		this.processDate = processDate;
//	}
	
	public  RawMaterialStock get(RawMaterialStock ps) {
		
		return ps;
	} }