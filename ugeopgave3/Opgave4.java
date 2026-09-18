public class Opgave4 {

    // OPG 4: Statistisk beregner

    void main(String[] args) {
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};

        System.out.println("Gennemsnit: " + calculateAverage(numbers));
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Over gennemsnit: " + countAboveAverage(numbers));

        System.out.println();
    }

    double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    int countAboveAverage(int[] numbers) {
        double average = calculateAverage(numbers);
        int count = 0;
        for (int num : numbers) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }

    void printAllStats(int[] numbers) {
        System.out.println("=== Statistik ===");
        System.out.println("Gennemsnit: " + calculateAverage(numbers));
        System.out.println("Største tal: " + findMax(numbers));
        System.out.println("Mindste tal: " + findMin(numbers));
        System.out.println("Antal over gennemsnit: " + countAboveAverage(numbers));
    }
}
