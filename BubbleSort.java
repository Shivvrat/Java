package labAlgo;

public class BubbleSort {

	static void BubbleSortInt(int[] a) {
		for (int count1 = 0; count1 < a.length - 1; count1++) {
			for (int count2 = 0; count2 < a.length; count2++) {
				if (count2 < a.length - 1 && a[count2] > a[count2 + 1]) {
					int temp = a[count2];
					a[count2] = a[count2 + 1];
					a[count2 + 1] = temp;
				}
			}
		}

	}

	static void BubbleSortWord(String[] a) {
		for (int count1 = 0; count1 < a.length - 1; count1++) {
			for (int count2 = 0; count2 < a.length; count2++) {
				if (count2 < a.length - 1 && (a[count2].compareTo(a[count2 + 1]) > 0)) {
					{
						String temp = a[count2];
						a[count2] = a[count2 + 1];
						a[count2 + 1] = temp;
					}
				}
			}
		}

	}
}
