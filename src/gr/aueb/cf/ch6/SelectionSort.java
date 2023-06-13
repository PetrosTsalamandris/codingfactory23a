package gr.aueb.cf.ch6;

/**
 * Array sort with selectio sort
 * time complexity: 0(n^2)
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 14, 3, 25, 12};

        int minVal;
        int minPosition;
        int tmp;

        for(int i = 0; i < arr.length; i++) {

            //find the min value
            minPosition = i;
            minVal = arr[i];
            for (int j = i + i; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minPosition = j;
                }
            }

            //swap
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
