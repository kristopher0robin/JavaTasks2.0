package Lesson02_OOPbasics;

public class RandomFromArray {
    private int[] values; // значения
    private int[] weights; // веса
    private int[] ranges; // левые границы отрезков
    private int sum; // общая длина всех отрезков

    public RandomFromArray(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];

        // сумма длин всех отрезков
        sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        // заполняем ranges левыми границами
        int lastSum = 0;
        for (int i=0; i < ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
    }

    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));

        int ourRangeIndex = 0;
        for(int i=0; i < ranges.length; i++) {
            if (ranges[i] > random) { break; }
            ourRangeIndex = i;
        }

        return values[ourRangeIndex];
    }
}
