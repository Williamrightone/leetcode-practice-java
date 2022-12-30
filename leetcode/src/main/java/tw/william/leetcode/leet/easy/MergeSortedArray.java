package tw.william.leetcode.leet.easy;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 0, 0, 0 };

		int m = 3;

		int[] b = { 2, 5, 6 };

		int n = 3;

		merge(a, m, b, n);

	}

	static void merge(int[] nums1, int m, int[] nums2, int n) {

		if (n == 0) {
			return;
		}

		if (m == 0) {
			for (int i = 0; i < n; i++)

				nums1[i] = nums2[i];

			return;
		}

		int i = m - 1, j = n - 1, k = m + n - 1;

		while (i >= 0 && j >= 0) {

			if (nums1[i] > nums2[j])
				nums1[k--] = nums1[i--];

			else
				nums1[k--] = nums2[j--];

		}

		while (j >= 0)

			nums1[k--] = nums2[j--];
	}

}
