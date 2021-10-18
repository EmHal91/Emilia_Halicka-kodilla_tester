import java.util.Random;

public class RandomNumbers {
    int los;

    public static void main(String[] args) {

        Random random = new Random(31);

        int los = random.nextInt(31);

        int max = getMaxLos(random.nextInt( 31 ));
        int min = getMinLos(random.nextInt( 31 ));
        int sum = getSum(random.nextInt( 31 ));

        System.out.println("Wylosowana liczba wynosi" + los);
    }

    public RandomNumbers (Random [] randoms){
        this.los = los;
    }

    public static int getMaxLos(int randoms) {
        int max = 30;
        if (max <= 0) {
        }
        System.out.println("Maksymalna wylosowana wartość wynosi" + max);
        return max;
    }
    public static int getMinLos(int i) {
        int los = 0;
        int min = 0;
        if (min >= los) {
        }
        System.out.println("Minimalna wylosowana wartość wynosi" + min);
        return min;
    }
    public static int getSum(int i) {
        int sum = 0;
        int newMaxSum = 2;
        int newMinSum = 1;
        while(sum <= 5000){
            sum = sum;
            System.out.println(sum);
            sum++;
            if(newMaxSum>sum){
                System.out.println("To jest nowa maksymalna suma" + newMaxSum);
            }
            else {
                System.out.println("To nie jest nowa minimalna suma" + newMinSum);
            }
        }
        return newMaxSum;

    }
}













