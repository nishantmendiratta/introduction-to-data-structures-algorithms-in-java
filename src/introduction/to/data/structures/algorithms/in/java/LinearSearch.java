package introduction.to.data.structures.algorithms.in.java;

public class LinearSearch {
    public static int linearSearch (int[] numbers, int x) {
        for (int number : numbers) {
            if (number == x) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] numbersList = {1, 2, 3, 4, 5, 6, 7};
        int x = 9;
        int result = linearSearch(numbersList, x);
        if (result == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
