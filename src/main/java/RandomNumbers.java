public class RandomNumbers {
    private int[] theNumbers;
    int number;
    int suma = 0;
    int min;
    int max;
    int ilośćLiczb = 31, i;

    public int[] RandomNumbers(int number) {
        int[] theNumbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        return theNumbers;

    }

    public void sumNumber(int number) {
        int sum = 5000;
        for (int i = 0; i < theNumbers.length; i++) {
            sum = sum + number;

            if (sum > 500) {
                return sum >5000;
            }
        }
    }
}
public void minNumber () {
    min = Math.round(31*(theNumbers.length()));
    System.out.println("Wylosowano liczby:" + min + ",");

    max= min;
    suma= suma+max;
    for (i= 1; i <= theNumbers.length-1; i++);

}
}