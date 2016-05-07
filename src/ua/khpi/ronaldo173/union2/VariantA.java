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

		final int[] arr1 = { 12, 13, 15 };
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] *= 2;
		}
		System.out.println(Arrays.toString(arr1));

		final String string = "bla_bla";
		System.out.println(string);

		final Integer i1 = new Integer(222);
		System.out.println(i1);

	}

	/**
	 * Utill class.
	 */
	private VariantA() {

	}

}
