package Lesson01_Basics;

public class MaxMinAverage {

    public static void main(String[] args) {
        int n = 100;
        double[] arr = new double[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        double max = arr[0]; // массив не должен быть пустым
        double min = arr[0];
        double avg = 0;

        for(int i=0; i < arr.length; i++) {
            if (max < arr[i]) { max = arr[i]; }
            if (min > arr[i]) { min = arr[i]; }
            avg += arr[i] / arr.length;
        }

        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("avg " + avg);
    }

}

