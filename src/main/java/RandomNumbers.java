public class RandomNumbers {
    int start = 0;
    int end = 31;

    public static void main(String[] args) {

        RandomNumbers random = new RandomNumbers();

        for (int i = 0; i < 31; i++) {
            int start = 0;
            int end = 31;
            System.out.println(i);
            System.out.println(randomBetween(0, 31));
        }
    }
    public static int randomBetween(int start, int end) {
        RandomNumbers random = new RandomNumbers();

        int n1 = random.nextInt(end - start - 1);
        int n2 = n1 + start;

        System.out.println(n2);
        return n2;
    }

    public static int nextInt(int random) {

        for (int i = 0; i < 31; i++) {
        }
        System.out.println(random);
        return random;
    }

}













