package com.currencycalapp.main;

import java.util.Scanner;

import com.currencycal.service.CurrencyCountService;

public class CurrencyCalculatorDriver {

	public static void main(String[] args) {

		CurrencyCountService currencyCountServiceObj = new CurrencyCountService();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of Currency Denominations: ");
		int nOfDenom = scanner.nextInt();

		int arr[] = new int[nOfDenom];
		System.out.println("Enter the Currency Denomination values: ");
		for (int i = 0; i < nOfDenom; i++)
			arr[i] = scanner.nextInt();

		System.out.println("Enter the Amount you want to Pay:  ");
		int amount = scanner.nextInt();

		currencyCountServiceObj.bubbleSort(arr);
		currencyCountServiceObj.noOfCurrency(amount, arr);

		scanner.close();
	}

}
