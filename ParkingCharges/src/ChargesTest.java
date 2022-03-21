import junit.framework.TestCase;

public class ChargesTest extends TestCase {
    Charges testObj = new Charges();

    //INVALIDS

    // Test Number: 1
    // Objective: Test low invalid values
    // Input(s): Hours = -1
    // Expected Output: Exception Object with "Invalid (low) values" message
    public void test_calculateCharges001() {
        try {
            testObj.calculateCharges(-1);
            fail("Test should not reach this line!");
        } catch (ChargesExceptionHandler e) {
            assertEquals("Invalid (low) values", e.getMessage());
        }
    }

    // Test Number: 2
    // Objective: Test low invalid values
    // Input(s): Hours = -1
    // Expected Output: Exception Object with "Invalid (high) values" message
    public void test_calculateCharges002() {
        try {
            testObj.calculateCharges(25);
            fail("Test should not reach this line!");
        } catch (ChargesExceptionHandler e) {
            assertEquals("Invalid (high) values", e.getMessage());
        }
    }


    //VALIDS

    // Test Number: 3
    // Objective: Test low minimum fee valid values
    // Input(s): Hours = 0
    // Expected Output: 2.00
    public void test_calculateCharges003() {
        try {
            assertEquals(2.00, testObj.calculateCharges(0));
        } catch (ChargesExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 4
    // Objective: Test low high minimum fee valid values
    // Input(s): Hours = 3
    // Expected Output: 2.00
    public void test_calculateCharges004() {
        try {
            assertEquals(2.00, testObj.calculateCharges(3));
        } catch (ChargesExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 5
    // Objective: Test low excess of three hours valid values
    // Input(s): Hours = 4
    // Expected Output: 2.50
    public void test_calculateCharges005() {
        try {
            assertEquals(2.50, testObj.calculateCharges(4));
        } catch (ChargesExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 6
    // Objective: Test high excess of three hours valid values
    // Input(s): Hours = 24
    // Expected Output: 10.00
    public void test_calculateCharges006() {
        try {
            assertEquals(10.00, testObj.calculateCharges(24));
        } catch (ChargesExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 7
    // Objective: Test  valid values
    // Input(s): Hours = 17.99
    // Expected Output: 9.50
    public void test_calculateCharges007() {
        try {
            assertEquals(9.50, testObj.calculateCharges(17.99));
        } catch (ChargesExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }

    // Test Number: 8
    // Objective: Test  valid values
    // Input(s): Hours = 1000
    // Expected Output: 10.00
    public void test_calculateCharges008() {
        try {
            assertEquals(10.00, testObj.calculateCharges(18));
        } catch (ChargesExceptionHandler e) {
            fail("Test should not reach this line!");
        }
    }
}