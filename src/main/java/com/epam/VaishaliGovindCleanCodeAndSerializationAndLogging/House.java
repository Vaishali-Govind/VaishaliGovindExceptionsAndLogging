package com.epam.VaishaliGovindCleanCodeAndSerializationAndLogging;

import java.util.HashMap;

public class House {
	
	private float totalArea;
	private boolean fullyAutomated;
	private String materialType;
	private float housePrice;
	
	HashMap<String, Integer> costPerSquareFoot = new HashMap<String, Integer>();
	
	public House() {
		this.fullyAutomated = false;
		costPerSquareFoot.put("standard", 1200);
		costPerSquareFoot.put("aboveStandard", 1500);
		costPerSquareFoot.put("highStandard", 1800);
		costPerSquareFoot.put("highStandardFullyAutomated", 2500);
	}
	
	public House(float totalArea, String materialType, boolean fullyAutomated) {
		this();
		this.totalArea = totalArea;
		this.materialType = materialType;
		this.fullyAutomated = fullyAutomated;
	}
	
	public float getHousePrice() {
		this.housePrice += this.totalArea * this.costPerSquareFoot.get(materialType) + (this.fullyAutomated ? 700 : 0);
		return this.housePrice;
	}
	
}

