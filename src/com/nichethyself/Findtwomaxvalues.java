package com.nichethyself;

public class Findtwomaxvalues {
	public void GetTwoMaxValues(int[] nums) {

		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}

		}

		System.out.println("Max1 - " + maxOne);
		System.out.println("Max2 - " + maxTwo);
	}

	public static void main(String[] args) {

		int list[] = { 15, 16, 12, 9, 8, 1, 100, 0 };

		Findtwomaxvalues max = new Findtwomaxvalues();
		max.GetTwoMaxValues(list);
		
	}

}
