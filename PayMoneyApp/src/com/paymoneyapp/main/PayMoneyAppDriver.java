package com.paymoneyapp.main;

import java.util.Scanner;

import com.paymoneyapp.service.TransactionService;

public class PayMoneyAppDriver {

	public static void main(String[] args) {

		TransactionService transactionObj = new TransactionService();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of transaction Array: ");
		int sizeOfArray = scanner.nextInt();

		int arr[] = new int[sizeOfArray];
		System.out.println("Enter the values of Array: ");
		for (int i = 0; i < sizeOfArray; i++)
			arr[i] = scanner.nextInt();

		System.out.println("Enter the Total no of Targets that needs to be achieved: ");
		int targetNo = scanner.nextInt();
		int targetValue;

		for (int i = 0; i < targetNo; i++) {

			System.out.println("Enter the value of Target: ");
			targetValue = scanner.nextInt();
			transactionObj.isTargetAchievable(targetValue, arr);
		}

		scanner.close();
	}

}
