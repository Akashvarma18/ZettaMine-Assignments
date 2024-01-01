package com.zeetamine.rainfall.dao;

import java.util.List;

import com.zeetamine.rainfall.dto.AnnualRainfall;

public interface RainfallDAO {
    int[] saveAnnualRainfall(List<AnnualRainfall> annualRainfall);
    List<AnnualRainfall> retrieveAnnualRainfall();
}
