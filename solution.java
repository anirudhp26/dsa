import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};
        merge(nums1, 1, nums2, 5);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        else {
            int count = 0;
            for (int i = m; i < m+n; i++) {
                nums1[i] = nums2[count++];
            }
            System.out.println(Arrays.toString(nums1));
        }

        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - 1 - i; j++) {
                if (nums1[j] > nums1[j+1]) {
                    swap(nums1, j, j+1);
                    System.out.println(Arrays.toString(nums1));
                }
            }
        }
        return nums1;
    }
    public static int[] swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}