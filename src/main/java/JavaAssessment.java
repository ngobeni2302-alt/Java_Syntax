import java.util.ArrayList;
import java.util.List;

public class JavaAssessment {

    // =========================================================================
    // Question 1 - fizzBuzzSa(int n)
    // =========================================================================
    // South Africa has 11 official languages. Count from 1 to n following these rules:
    // - If divisible by 3, print "Zulu"
    // - If divisible by 5, print "Xhosa"
    // - If divisible by both 3 and 5, print "Eleven"
    // - Otherwise, print the number itself
    public static void fizzBuzzSa(int n) {
        // TODO: Write a loop counting from 1 to n and add your conditional logic here
        for (int i = 1; i <= n; i++){
            if (i == 1 || i == 2){
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Eleven");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Xhosa");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Zulu");
            } else {
                System.out.println(i);
            }
        }
    }

    // =========================================================================
    // Question 2 - loadSheddingSchedule(int[] hours)
    // =========================================================================
    // Filter the array of active load shedding hours (0-23) to return a List
    // containing only the hours that fall within peak times:
    // - Between 6 and 9 (inclusive) OR between 17 and 21 (inclusive)
    // Note: Do not use built-in stream filtering. Use a loop and conditional logic.
    public static List<Integer> loadSheddingSchedule(int[] hours) {
        List<Integer> peakHours = new ArrayList<>();

        // TODO: Use a loop to scan 'hours'. If an hour matches peak times, add it
        // to peakHours using peakHours.add(hour);
        for (int hour : hours) {
            if (hour >= 6 && hour <= 9 || hour >= 17 && hour <= 21) {
                peakHours.add(hour);
            }
        }
        return peakHours;
    }

    // =========================================================================
    // Question 3 - computeFare(int distance, int passengers) -- Debug This!
    // =========================================================================
    // Base fare: R15. Per kilometer: R3.
    // If passengers > 3, charge R5 per EXTRA passenger above 3.
    // Minimum fare boundary: No trip should cost less than R20.
    public static int computeFare(int distance, int passengers) {
        /* * Bugs to fix from the original broken logic:
         * 1. Multiplied distance incorrectly: total = base + per_km + distance
         * 2. Calculated passenger charge logic broken: charge = extra + 5
         * 3. Failed to trigger minimum cap because of an equality evaluation check: total == 20
         * 4. Handled missing edge case for checking passenger counts cleanly.
         */
        int base = 15;
        int perKm = 3;

        // TODO: Fix the math and assignment bugs below to make the output calculations match perfectly
        int total = base + (perKm * distance);

        if (passengers > 3) {
            int extra = passengers - 3;
            int charge = extra * 5;
            total = total + charge;
        }

        if (total < 20) {
            total = 20;
            // total == 20; // This doesn't assign values in Java! Fix this assignment line.
        }

        return total;
    }

    // =========================================================================
    // Question 4 - atmWithdrawal(int balance, int amount)
    // =========================================================================
    // Capitec ATM approval checks:
    // - Amount must be > 0
    // - Amount must be a multiple of 50 (ATM only dispenses R50 notes)
    // - Remaining balance after withdrawal must be at least R100
    //
    // Returns:
    // "Success: Withdrawal approved"
    // "Error: Invalid amount" (if <= 0 or not a multiple of 50)
    // "Error: Insufficient funds" (if remaining balance drops below R100)
    public static String atmWithdrawal(int balance, int amount) {
        // TODO: Implement the conditional validation rules here
        if (amount <=0 || amount % 50 != 0){
            return "Error: Invalid amount";
        } else if (balance - amount <= 99) {
            return "Error: Insufficient funds";
        } else {
           return "Success: Withdrawal approved";
        }
    }

    // =========================================================================
    // Question 5 - checkStudentPass(...) -- Debug This!
    // =========================================================================
    // WeThinkCode_ module pass metrics:
    // - Attendance must be at least 80% (>= 80)
    // - Average mark must be 60% or above (>= 60)
    // - Student must have submitted ALL assignments
//    public static boolean checkStudentPass(int attendance, int averageMark, int assignmentsSubmitted, int totalAssignments) {
//        /*
//         * Bugs to fix from the original broken logic:
//         * 1. Evaluated average mark incorrectly (used '>' instead of '>=')
//         * 2. Integer division trap: dividing an int by an int drops decimal data.
//         * 3. Evaluation criteria bug: 'if not submitted_all:' expects a boolean, but got a numeric fraction result.
//         */
//        boolean passedAttendance = attendance >= 80;
//        boolean passedMark = averageMark >= 60;
//
//        // TODO: Fix the calculation assignment below to properly check if all assignments were submitted
//        // Hint: In Java, comparing assignmentsSubmitted directly to totalAssignments is safer than division!
//        double submittedAll = assignmentsSubmitted / totalAssignments;
//
//        if (!passedAttendance) {
//            return false;
//        }
//        return passedMark;
//        // if (!submittedAll) { // This will crash in Java because submittedAll isn't a boolean!
//        //     return false;
//        // }
    }
}