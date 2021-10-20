import java.util.Random;

public class RandomNumbers {
    int los;
    static int min;
    static int max;

    public static void main(String[] args) {

        int sum = getSum();
        int max = getMaxLos();
        int min = getMinLos();

        System.out.println("Wylosowana liczba wynosi" + sum);
    }

    public RandomNumbers (Random [] randoms){
        this.los = los;
    }

    public static int getMaxLos() {
        return max;
    }
    public static int getMinLos() {
        return min;
    }

    public static int getSum() {
        Random random = new Random(31);
        int sum = random.nextInt(31);
        max = sum;
        min = sum;
        while(sum <= 5000){
            int los = random.nextInt(31);
            sum = sum + los;
            System.out.println(sum);
            if(los>max){
                max=los;
                System.out.println("To jest nowa maksymalna suma" + max);
            }
            if (los<min) {
                min=los;
                System.out.println("To nie jest nowa minimalna suma" + min);
            }
        }
        return sum;

    }
}













