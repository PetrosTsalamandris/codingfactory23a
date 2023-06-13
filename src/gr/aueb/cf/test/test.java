package gr.aueb.cf.test;

public class test {

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        int missingNumber = getMissing(arr);
        System.out.println("Missing number:" + missingNumber);
    }

    public static int getMissing(int[] arr) {
        int n = arr.length +1;
        int totalSum = (n *(n +1)) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = totalSum - actualSum;
        return missingNumber;
    }
}
