package Lecture17;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		sol(arr);
	}

	public static void sol(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}
}
