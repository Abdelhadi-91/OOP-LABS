import java.util.Scanner;

public class task3 {

    static int countOcc(int[] x, int target) {
        int count = 0;
        for (int i : x) {
            if (i == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array;
        System.out.print("Enter the array length: ");
        int N = scanner.nextInt();
        array = new int[N];
        if (N > 0) {
            System.out.println("----------------------------------------------");
            System.out.println("Now enter arrays values");
            for (int i = 0; i < N; i++) {
                System.out.print("array[" + i + "] = ");
                array[i] = scanner.nextInt();
            }
            System.out.println("----------------------------------------------");
            System.out.print("Now enter the target: ");
            int target = scanner.nextInt();
            int count = countOcc(array, target);
            System.out.println("----------------------------------------------");
            System.out.println(target+" appears "+count+" times");
        } else {
            System.out.println("Length must be greater than 0");
        }
        scanner.close();
    }
}
