package com.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

public class StatisticsImplTest extends TestCase {

	private Statistics s;
	private List<BigDecimal> values;
	private BigDecimal expectedMean;
	private BigDecimal expectedMedian;
	
	public void setUp() {
		values = new ArrayList<BigDecimal>();
		values.add(new BigDecimal(5));
		values.add(new BigDecimal(4));
		values.add(new BigDecimal(3));
		values.add(new BigDecimal(1));
		values.add(new BigDecimal(2));
		
		expectedMean = new BigDecimal(3);
		expectedMedian = new BigDecimal(3);
	}
	
	@Test
	public void testGetMean(){
		s = new StatisticsImpl();
		BigDecimal mean = s.getMean(values);
		assertEquals("Expected mean: " + expectedMean, expectedMean, mean);
	}
	
	@Test
	public void testGetMedian(){
		s = new StatisticsImpl();
		BigDecimal median = s.getMedian(values);
		assertEquals("Expected median: " + expectedMedian, expectedMean, median);
	}
	
	@Override
	public void tearDown() {
		
	}
	
}
