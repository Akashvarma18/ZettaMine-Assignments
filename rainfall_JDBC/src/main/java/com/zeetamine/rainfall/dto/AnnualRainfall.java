package com.zeetamine.rainfall.dto;

public class AnnualRainfall{
	
	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;
	
	
	
	public AnnualRainfall(int cityPincode, String cityName, double averageAnnualRainfall) {
		super();
		this.cityPincode = cityPincode;
		this.cityName = cityName;
		this.averageAnnualRainfall = averageAnnualRainfall;
	}


	public int getCityPincode() {
		return cityPincode;
	}


	public void setCityPincode(int cityPincode) {
		this.cityPincode = cityPincode;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public double getAverageAnnualRainfall() {
		return averageAnnualRainfall;
	}


	public void setAverageAnnualRainfall(double averageAnnualRainfall) {
		this.averageAnnualRainfall = averageAnnualRainfall;
	}


	public  void calculateAverageAnnualRainfall(double monthlyRainfall [] ) {
	  double sum = 0;
	  double avgAnnualRainfall = 0;
	  int count = 0;
	  for(double i : monthlyRainfall) {
		  sum = sum + i;
		  count++;
	  }
	  avgAnnualRainfall = sum / count; 
	  this.averageAnnualRainfall = avgAnnualRainfall;
	}


	public AnnualRainfall(int cityPincode, String cityName) {
		super();
		this.cityPincode = cityPincode;
		this.cityName = cityName;
	}
}

