import java.util.Random;

public class RandomNumbers {
    
    public static void main(String[] args) {

        Random random = new Random();
        
        int max = getMaxLos(random.nextInt(31));
        int min = getMinLos(random.nextInt(31));
        int sum = getSum(random.nextInt(31));

        int los = random.nextInt(31);

        System.out.println("Wylosowana liczba wynosi" + los);
    }

    public static int getMaxLos(int randoms) {
        int max = 30;
        int los = 30;
        if (max <= los) {
        }
        System.out.println("Maksymalna wylosowana wartość wynosi" + max);
        return max;
    }
    public static int getMinLos(int randoms) {
        int los = 0;
        int min = 0;
        if (min >= los) {
        }
        System.out.println("Minimalna wylosowana wartość wynosi" + min);
        return min;
    }
    public static int getSum (int los) {
        int sum = 0;
        while(sum <= 5000){
            sum = sum + los;
            System.out.println(sum);
            sum++;
        }
        return sum;
    }
}













