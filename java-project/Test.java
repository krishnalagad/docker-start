import java.util.Properties;

public class Test {

    public static void printSystemProperties() {
        System.out.println("Printing System Properties...");
        Properties props = System.getProperties();
        System.out.println(props);
    }

    public static void main(String[] args) {
        System.out.println("Project started...");
        printSystemProperties();
    }
}