package com.customer;

import java.math.BigDecimal;
import java.util.List;

public interface Statistics {

	public BigDecimal getMean(List<BigDecimal> values);
	public BigDecimal getMedian(List<BigDecimal> values);
	
}
