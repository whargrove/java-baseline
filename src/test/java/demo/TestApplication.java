package demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class TestApplication {

    private final PrintStream stdOut = System.out;
    private final ByteArrayOutputStream outCapture = new ByteArrayOutputStream();

    @BeforeEach
    public void beforeEach() {
        System.setOut(new PrintStream(outCapture));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(stdOut);
    }

    @Test
    void shouldRun() {
        Application.main(new String[0]);
        assertThat(outCapture.toString()).contains("Hello, World!");
    }
}
