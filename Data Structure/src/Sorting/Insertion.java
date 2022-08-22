package Sorting;

public class Insertion {

	public void insertionSort(int a[]) {

		for (int i = 1; i < a.length; i++) {

			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int s[] = { 47, 56, 77, 12, 54 };
		Insertion t = new Insertion();
		t.insertionSort(s);

		for (int i : s) {
			System.out.println(i);
		}

	}
}
