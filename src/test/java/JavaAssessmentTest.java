import org.junit.jupiter.api.Test;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class JavaAssessmentTest {

    // =========================================================================
    // Q1 Test - fizzBuzzSa
    // =========================================================================
    @Test
    public void testFizzBuzzSa() {
        // Capture system.out print statements
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the function
        JavaAssessment.fizzBuzzSa(15);

        // Restore system output streams
        System.setOut(originalOut);

        // System-independent line breaks format
        String expectedOutput = "1\n2\nZulu\n4\nXhosa\nZulu\n7\n8\nZulu\nXhosa\n11\nZulu\n13\n14\nEleven\n"
                                .replace("\n", System.lineSeparator());
        
        assertEquals(expectedOutput, outContent.toString());
    }

    // =========================================================================
    // Q2 Test - loadSheddingSchedule
    // =========================================================================
    @Test
    public void testLoadSheddingSchedule() {
        int[] inputHours = {0, 6, 8, 13, 17, 19, 22};
        List<Integer> result = JavaAssessment.loadSheddingSchedule(inputHours);
        
        // Output should be exactly [6, 8, 17, 19]
        assertEquals(4, result.size());
        assertEquals(6, result.get(0));
        assertEquals(8, result.get(1));
        assertEquals(17, result.get(2));
        assertEquals(19, result.get(3));
    }

    // =========================================================================
    // Q3 Test - computeFare
    // =========================================================================
    @Test
    public void testComputeFare() {
        assertEquals(45, JavaAssessment.computeFare(10, 2), "Failed on distance=10, passengers=2");
        assertEquals(28, JavaAssessment.computeFare(1, 5), "Failed on distance=1, passengers=5");
        assertEquals(20, JavaAssessment.computeFare(1, 1), "Failed on distance=1, passengers=1");
    }

    // =========================================================================
    // Q4 Test - atmWithdrawal
    // =========================================================================
    @Test
    public void testAtmWithdrawal() {
        assertEquals("Success: Withdrawal approved", JavaAssessment.atmWithdrawal(500, 350));
        assertEquals("Error: Insufficient funds", JavaAssessment.atmWithdrawal(500, 450));
        assertEquals("Error: Invalid amount", JavaAssessment.atmWithdrawal(500, 75));
    }

    // =========================================================================
    // Q5 Test - checkStudentPass
    // =========================================================================
    @Test
    public void testCheckStudentPass() {
        assertTrue(JavaAssessment.checkStudentPass(85, 65, 10, 10), "Failed on standard pass conditions");
        assertTrue(JavaAssessment.checkStudentPass(85, 60, 10, 10), "Failed exactly at 60% mark boundary");
        assertFalse(JavaAssessment.checkStudentPass(85, 65, 8, 10), "Failed to catch incomplete assignment submissions");
        assertFalse(JavaAssessment.checkStudentPass(70, 65, 10, 10), "Failed to catch poor class attendance");
    }
}
