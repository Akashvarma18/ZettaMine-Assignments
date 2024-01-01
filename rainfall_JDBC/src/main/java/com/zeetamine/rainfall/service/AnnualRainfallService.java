package com.zeetamine.rainfall.service;

import java.util.List;

import com.zeetamine.rainfall.dto.AnnualRainfall;

public interface AnnualRainfallService{
    void saveAnnualRainfall(List<AnnualRainfall> annualRainfall);
    void retrieveMaxAnnualRainfall();
}
