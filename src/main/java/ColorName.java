import java.util.Scanner;
public class ColorName {
    public static String getColorname() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Select the first letter of a color (P - pomarańczowy, N- niebieski, G- granatowy, Z- zielony):");
            String first = scanner.nextLine().trim().toUpperCase();
            swich (first) {
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
    public static int getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int let = scanner.nextInt();
        return let;
}
