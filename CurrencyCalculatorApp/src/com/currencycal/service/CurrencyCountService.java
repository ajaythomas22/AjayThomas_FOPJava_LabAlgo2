package com.currencycal.service;

public class CurrencyCountService {

	public void noOfCurrency(int amount, int[] arr) {

		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= amount) {

				result[i] = amount / arr[i];
				amount = amount % arr[i];

			}
		}
		if (amount > 0) {
			System.out.println("Amount cannot be made with given Denominations!!!");
		} else {
			System.out.println("Your Payment approach in order to give minimum No. of Notes will be:");
			for (int i = 0; i < result.length; i++) {

				if (result[i] != 0) {
					System.out.println(arr[i] + " Notes X " + result[i]);
				}
			}
		}
	}

	public void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] < arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
