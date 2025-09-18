/*
 * JUnit Tests: A Deeper Dive
 *
 * What is JUnit?
 * JUnit is a widely used, open-source testing framework for Java. It's the de facto standard for writing unit tests in Java applications. Unit testing is a software testing method where individual units or components of a software are tested. The purpose is to validate that each unit of the software performs as designed.
 *
 * Why Use JUnit?
 * - Ensures Correctness: Helps verify that individual parts of your code work as expected.
 * - Facilitates Refactoring: Gives you confidence that changes to your code don't break existing functionality.
 * - Improves Design: Writing tests often leads to better, more modular, and testable code.
 * - Documentation: Tests can serve as living documentation for how a piece of code is supposed to behave.
 * - Regression Prevention: Catches bugs introduced by new changes or features.
 *
 * Key Concepts and Annotations (JUnit 5 - Jupiter API):
 * JUnit 5 is the latest major version, and it's what you're using. It's composed of several modules, with the "Jupiter" API being the one you interact with for writing tests.
 *
 * 1. @Test:
 *    - Purpose: Marks a method as a test method. JUnit will discover and execute any method annotated with @Test.
 *    - Example:
 *      ```java
 *      @Test
 *      void myFirstTest() {
 *          // ... test logic ...
 *      }
 *
 *
 * 2. @DisplayName("My Test Name"):
 *    - Purpose: Provides a custom display name for a test class or test method. This makes test reports more readable.
 *    - Example:
 *java
 *      @Test
 *      @DisplayName("Should add two numbers correctly")
 *      void testAddition() {
 *          // ...
 *      }

 *
 * 3. @BeforeEach:
 *    - Purpose: Marks a method to be executed *before each* test method in the current test class. Useful for setting up common test data or state.
 *    - Example:
 *    java
 *      MyMath math;
 *      @BeforeEach
 *      void setup() {
 *          math = new MyMath();
 *      }
 *      @Test
 *      void testSomething() {
 *          // math is ready to use
 *      }
 *
 *
 * 4. @AfterEach:
 *    - Purpose: Marks a method to be executed *after each* test method. Useful for cleaning up resources.
 *
 * 5. @BeforeAll:
 *    - Purpose: Marks a static method to be executed *once before all* test methods in the current test class. Useful for expensive setup that can be shared across all tests.
 *
 * 6. @AfterAll:
 *    - Purpose: Marks a static method to be executed *once after all* test methods. Useful for cleaning up shared resources.
 *
 * 7. @Disabled("Reason for disabling"):
 *    - Purpose: Disables a test class or test method, preventing it from being run.
 *
 * Assertion Methods (from org.junit.jupiter.api.Assertions):
 * These are static methods you use to verify expected outcomes. You typically import them statically (`import static org.junit.jupiter.api.Assertions.*;`) for cleaner code.
 *
 * - assertEquals(expected, actual, [message]): Asserts that two values are equal. (e.g., assertEquals(10, result);)
 * - assertTrue(condition, [message]): Asserts that a condition is true. (e.g., assertTrue(list.isEmpty());)
 * - assertFalse(condition, [message]): Asserts that a condition is false.
 * - assertNull(object, [message]): Asserts that an object is null.
 * - assertNotNull(object, [message]): Asserts that an object is not null.
 * - assertThrows(expectedType, executable, [message]): Asserts that executing a piece of code throws an expected exception.
 * - assertArrayEquals(expectedArray, actualArray, [message]): Asserts that two arrays are equal.
 * - fail([message]): Fails the test immediately. (As seen in your initial example, often used as a placeholder.)
 *
 * Best Practices for Writing Unit Tests:
 * - F.I.R.S.T Principles:
 *   - Fast: Tests should run quickly.
 *   - Independent: Tests should not depend on each other.
 *   - Repeatable: Running a test multiple times should yield the same result.
 *   - Self-validating: Tests should automatically determine if they passed or failed.
 *   - Timely: Write tests early, ideally before or alongside the code they test (Test-Driven Development - TDD).
 * - Test One Thing: Each test method should ideally focus on testing a single piece of functionality or a single scenario.
 * - Meaningful Names: Give your test methods descriptive names that explain what they are testing (e.g., shouldReturnCorrectSumForPositiveNumbers).
 * - Arrange-Act-Assert (AAA) Pattern:
 *   - Arrange: Set up the test data and environment.
 *   - Act: Perform the action you want to test.
 *   - Assert: Verify the outcome using assertion methods.
 * - Avoid System.out.println: As discussed, keep tests clean. Use logging frameworks if you need more detailed output during debugging, but typically, tests should pass silently.
 */
package com.mbarekDev.devApp_ms;

import com.mbarekDev.junit.MyMath;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    MyMath math1 = new MyMath();
    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps", "Automation");

    @Test
    public void testAddition() {
        int expected = 5;
        int actual = 2 + 3;
        assertEquals(expected, actual, "2 + 3 should be 5");
    }

    @Test
    public void anotherTest() {
        int[] nums = {1, 2, 3, 4};

        int res = math1.calculateSum(nums);
        // Removed System.out.println(res); as it's not recommended in final test code.
        int expectedRes = 10; // Corrected expected sum from 6 to 10
        assertEquals(expectedRes, res, "Sum of {1,2,3,4} should be 10");
    }

    @Test
    public void caclulatesum_ThreeMemberArray() {
        assertEquals(5, math1.calculateSum(new int[]{1, 2, 2}));
    }

    @Test
    void test() {
        /*
        Expected :true
        Actual   :false
         */
        boolean test = todos.contains("AWSs");
       // assertEquals(true, test);
        //fail("Not yet implimented"); //> Task :test FAILED
        assertTrue(test);
    }
}
