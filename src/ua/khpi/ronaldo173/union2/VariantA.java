package ua.khpi.ronaldo173.union2;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang.ArrayUtils;

/**
 * It's tasks of variantA.
 * 
 * @author Developer
 *
 */
public final class VariantA {
	/**
	 * Get min and max digits amount.
	 * 
	 * @param array
	 *            of numbers
	 * @return arr [min,max]
	 */
	public static double[] shortestAndLongestNumber(final double[] array) {
		double[] result = new double[2];

		int min = 0;
		int max = Integer.MAX_VALUE;
		for (double d : array) {
			int length = Double.toString(d).length();
			if (length > min) {
				min = length;
				result[1] = d;
			}
			if (length < max) {
				max = length;
				result[0] = d;
			}
		}

		return result;
	}

	/**
	 * Sort by length of numbers(growing).
	 * 
	 * @param arr
	 *            expect arr of numbers
	 * @return sorted arr
	 */
	public static double[] sortByLength(final double[] arr) {

		Double[] sorted = new Double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sorted[i] = arr[i];
		}

		Arrays.sort(sorted, new Comparator<Double>() {

			public int compare(final Double o1, final Double o2) {
				Integer length1 = Double.toString(o1).length();
				Integer length2 = Double.toString(o2).length();
				return length1.compareTo(length2);
			}
		});
		return ArrayUtils.toPrimitive(sorted);

	}

	/**
	 * Check if an array palindrom.
	 * 
	 * @param word
	 *            expect array of letters for check is it palindrom
	 * @return true if yes
	 */
	public static boolean isPalindrom(final char[] word) {
		int i1 = 0;
		int i2 = word.length - 1;

		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;

	}

	/**
	 * Enter point to class.
	 * 
	 * @param args
	 *            don't expect
	 */
	public static void main(final String[] args) {
		double[] arr = { 999, 1, 111111, 22, 44 };
		double[] shortestAndLongestNumber = shortestAndLongestNumber(arr);
		System.out.println(Arrays.toString(shortestAndLongestNumber));

		double[] sortedByLength = sortByLength(arr);
		System.out.println(Arrays.toString(sortedByLength));

		boolean palindrom = isPalindrom("abcdcba".toCharArray());
		System.out.println("palindrom: " + palindrom);
	}

	/**
	 * Utill class.
	 */
	private VariantA() {

	}

}
