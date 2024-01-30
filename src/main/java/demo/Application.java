package demo;

import static java.lang.System.out;


public final class Application {
    /**
     * Main entry point.
     *
     * @param args the command-line arguments
     */
    public static void main(final String... args) {
        out.println("Hello, World!");
    }

    // This is a "utility" class, ie, no instances, only static methods
    private Application() { }
}
