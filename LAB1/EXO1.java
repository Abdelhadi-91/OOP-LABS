
public class EXO1 {
    public static void main(String[] args) {
        
        int quiz, midterm, finalExam;
        double average;
        String statue, merit;

        quiz = Integer.parseInt(args[0]);
        midterm = Integer.parseInt(args[1]);
        finalExam = Integer.parseInt(args[2]);

        if (
            (quiz>100 || midterm>100 || finalExam>100) ||
            (quiz<0 || midterm<0 || finalExam<0)) {
            System.out.println("Entries must be less than 100 and more than 0");
        } else {
            average = 0.2 * quiz + 0.3 * midterm + 0.5 * finalExam;
            System.out.println("---------------------");
            System.out.printf("Average = %.2f%n", average);

            if (average >= 50) {
                if (average >= 85) {
                    merit = "YES";
                } else {
                    merit = "NO";
                }
                statue = "PASS";
            } else {
                statue = "FAIL";
                merit = "NO";
            }
            System.out.println("Statue: " + statue);
            System.out.println("Merit: " + merit);
        }
    }
}
