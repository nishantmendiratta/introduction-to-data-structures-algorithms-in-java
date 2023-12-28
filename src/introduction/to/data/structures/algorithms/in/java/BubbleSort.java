package introduction.to.data.structures.algorithms.in.java;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {12, 8, 7, 5, 2};

        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length-i-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
