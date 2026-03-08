public class EXO10 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java EXO10 <id> <role> <time>");
            return;
        }
        
        int id = Integer.parseInt(args[0]);
        String role = args[1].toLowerCase();
        int time = Integer.parseInt(args[2]);
        
        switch (role) {
            case "staff":
                System.out.println("ACCESS GRANTED - Staff always allowed");
                break;
            case "ta":
                if (time >= 8 && time <= 20) {
                    System.out.println("ACCESS GRANTED - TA within allowed hours");
                } else {
                    System.out.println("ACCESS DENIED - TA outside allowed hours (8-20)");
                }
                break;
            case "student":
                if (time >= 9 && time <= 17 && id % 2 == 0) {
                    System.out.println("ACCESS GRANTED - Student with valid time and ID");
                } else if (time < 9 || time > 17) {
                    System.out.println("ACCESS DENIED - Student outside allowed hours (9-17)");
                } else {
                    System.out.println("ACCESS DENIED - Student ID must be even");
                }
                break;
            default:
                System.out.println("ACCESS DENIED - Invalid role");
        }
    }
}
