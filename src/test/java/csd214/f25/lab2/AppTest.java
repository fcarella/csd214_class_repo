package csd214.f25.lab2;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // These streams will hold the original System streams
    private static final InputStream originalIn = System.in;
    private static final PrintStream originalOut = System.out;

    // This stream will be used to capture output for tests
    private ByteArrayOutputStream testOut;

    // @BeforeAll runs ONCE before any tests in this class start.
    // It MUST be static.
    @BeforeAll
    public static void setupAll() {
        System.out.println("==========================================");
        System.out.println("  Starting AppMenu Tests...");
        System.out.println("==========================================");
    }

    // @AfterAll runs ONCE after all tests in this class have finished.
    // It MUST be static.
    @AfterAll
    public static void tearDownAll() {
        // Restore the original System.out so we can see the final message
        System.setOut(originalOut);
        System.out.println("==========================================");
        System.out.println("  AppMenu Tests Finished.");
        System.out.println("==========================================");
    }


    // @BeforeEach runs before EACH @Test method.
    @BeforeEach
    public void setUpStreams() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    // @AfterEach runs after EACH @Test method.
    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        // We don't restore System.out here anymore, as tearDownAll needs to be the last one to use it.
        // It's generally safe to let it be reset by the next setUpStreams or by tearDownAll.
        // For clarity, we'll restore it fully in tearDownAll.
    }

    /**
     * Helper method to create an App instance with simulated input.
     * @param input The string representing user input, with newlines for each entry.
     * @return A configured App instance ready for testing.
     */
    private App getAppWithSimulatedInput(String input) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        return new App(testIn, System.out); // System.out is already redirected to testOut
    }

    @Test
    void testMainMenuQuitOption() {
        String userInput = "99\n";
        App app = getAppWithSimulatedInput(userInput);
        app.run();
        String output = testOut.toString();
        assertTrue(output.contains("***********************"));
        assertTrue(output.contains("99. Quit"));
        assertTrue(output.contains("Exiting application. Goodbye!"));
    }

    @Test
    void addItem() {
    }
}