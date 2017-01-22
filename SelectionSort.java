package labAlgo;

public class SelectionSort {

	static void SelectionSortInt(int[] a) {

		int temp, pos;

		for (int i = 0; i < a.length - 1; i++) {
			pos = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[pos]) {
					pos = j;
				}
			}

			temp = a[i];

			a[i] = a[pos];

			a[pos] = temp;
		}

	}

	static void SelectionSortWord(String[] a) {

		for (int count1 = 0; count1 < a.length - 1; count1++) {
			String min = a[count1];
			int temp = 0;
			for (int count2 = count1 + 1; count2 < a.length; count2++) {
				if (min.compareTo(a[count2]) > 0) {
					min = a[count2];
					temp = count2;

				}
			}
			a[temp] = a[count1];
			a[count1] = min;

		}
	}
}
