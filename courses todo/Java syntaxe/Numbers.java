/*  Goal: Create a java program to print the odd numbers from 5 to 15 , except 7*/

public class Numbers {
    public static void main(String[] args) {
        // Incrementing 2 in each step (use "continue" to skip 7)
        for (int i = 5; i <= 15; i+=2) {
            if (i==7) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        // Incrementing 1 in each step (use "continue")
        for (int i = 5; i <=15; i++) {
            if (i==7 || i%2==0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        // With an endless loop (using "break" & "continue")
        int i =5;
        while (true) {
            if (i==7 || i%2==0) {
                i++;
                continue;
            }
            if (i>15) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
