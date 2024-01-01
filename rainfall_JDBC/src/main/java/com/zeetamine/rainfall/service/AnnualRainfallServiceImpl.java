package com.zeetamine.rainfall.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.zeetamine.rainfall.dao.RainfallDAO;
import com.zeetamine.rainfall.dao.RainfallDAOImpl;
import com.zeetamine.rainfall.dto.AnnualRainfall;

public class AnnualRainfallServiceImpl implements AnnualRainfallService {


	@Override
	public void saveAnnualRainfall(List<AnnualRainfall> annualRainfall) {
		RainfallDAO dao = new RainfallDAOImpl();
		int[] rowsAffected = dao.saveAnnualRainfall( annualRainfall);
		System.out.println(rowsAffected.length + "rows inserted successfully");
	}

	@Override
	public void retrieveMaxAnnualRainfall() {
	
		RainfallDAO dao = new RainfallDAOImpl();
		List<AnnualRainfall> avgAnnualRainfall = dao.retrieveAnnualRainfall();
		List<Double>  avgRainfall = new ArrayList<>();
		for(AnnualRainfall rainFall :  avgAnnualRainfall) {
			avgRainfall.add(rainFall.getAverageAnnualRainfall());
		}
		double maxRainfall = Collections.max(avgRainfall);
	    System.out.println("City Details with Maximum Average Annual Rainfall");
	    for(AnnualRainfall rainFall :  avgAnnualRainfall) {
			if(rainFall.getAverageAnnualRainfall() == maxRainfall) {
				System.out.printf("City pincode : %19d \n", rainFall.getCityPincode());
				System.out.printf("City Name    : %20s \n", rainFall.getCityName());
				System.out.printf("Average Annual rainFall :    %.2f \n",rainFall.getAverageAnnualRainfall());
			}
		}
		
	}

}
