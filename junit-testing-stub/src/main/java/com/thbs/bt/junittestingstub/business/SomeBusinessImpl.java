package com.thbs.bt.junittestingstub.business;

import com.thbs.bt.junittestingstub.data.SomeDataService;

public class SomeBusinessImpl {
	private SomeDataService someDataService;

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		for (int value : data) {
			sum += value;
		}

		return sum;
	}

}
