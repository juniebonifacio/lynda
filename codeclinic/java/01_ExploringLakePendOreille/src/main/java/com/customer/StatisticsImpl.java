package com.customer;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class StatisticsImpl implements Statistics {

	@Override
	public BigDecimal getMean(List<BigDecimal> values) {
		System.out.println("start StatisticsImpl.getMean");
		BigDecimal mean = null;
				
		if (null != values && values.size() != 0) {
			BigDecimal sum = new BigDecimal(0);
			BigDecimal noOfValues = new BigDecimal(values.size());
			for (BigDecimal bigDecimal : values) {
				sum = sum.add(bigDecimal);
			}
			System.out.println("total: " + sum);
			System.out.println("size: " + noOfValues);
			mean = sum.divide(noOfValues);
			System.out.println("mean: " + mean);
		}
		
		System.out.println("done StatisticsImpl.getMean");
		return mean;
	}

	@Override
	public BigDecimal getMedian(List<BigDecimal> values) {
		System.out.println("start StatisticsImpl.getMedian");
		BigDecimal median = null;
		System.out.println("values: " + values);
		
		//TODO: 1. sort the numbers from lowest to highest
		Collections.sort(values);
		System.out.println("values: " + values);
		
		
		BigDecimal noOfValues = new BigDecimal(values.size());
		System.out.println("noOfValues: " + noOfValues);
		int remainder = noOfValues.intValue() % 2;
		System.out.println("remainder: " + remainder);
		
		//TODO: 2. if odd number of values, take the middle number
		int middleNo;
		if ( remainder != 0) {
			middleNo = (noOfValues.intValue() / 2) + 1;
		}
		//TODO: 3. if even number of values, calculate the average of the central two numbers
		else {
			middleNo = (noOfValues.intValue() / 2);
		}
		System.out.println("middleNo: " + middleNo);
		median = new BigDecimal(middleNo);
		System.out.println("done StatisticsImpl.getMedian");
		
		return median;
	}

}
