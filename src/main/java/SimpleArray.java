public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Hania";
        names[1] = "Agnieszka";
        names[2] = "Ewelina";
        names[3] = "Beata";
        names[4] = "Krzysia";
        System.out.println(names);

        String name = names[3];
        int numberOfElements = names.length;
        System.out.println("Moja tablica zawiara 5 elementów");
    }
}