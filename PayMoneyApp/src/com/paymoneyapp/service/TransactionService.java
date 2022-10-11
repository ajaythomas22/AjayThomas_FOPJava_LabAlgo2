package com.paymoneyapp.service;

public class TransactionService {

	public void isTargetAchievable(int targetValue, int[] arr) {

		int sumOfTargets = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			sumOfTargets += arr[i];
			if (sumOfTargets >= targetValue) {

				System.out.println("Target achieved after " + (i + 1) + " Transactions!!!");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Given Target is not achieved!!!");
		}
	}

}
