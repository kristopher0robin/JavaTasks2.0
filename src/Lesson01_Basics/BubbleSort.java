package Lesson01_Basics;

public class BubbleSort {

    public static void main(String[] args) {
        int n = 100;
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
