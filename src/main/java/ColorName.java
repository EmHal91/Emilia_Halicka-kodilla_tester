import java.util.Scanner;
public class ColorName {
    public static String getColorname() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the first letter of a color (P - pomarańczowy, N- niebieski, G- granatowy, Z- zielony):");
            String first = scanner.nextLine().trim().toUpperCase();
            switch (first) {
                case "P":
                    return "POMARAŃCZOWY";
                case "N":
                    return "NIEBIESKI";
                case "G":
                    return "GRANATOWY";
                case "Z":
                    return "ZIELONY";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}
