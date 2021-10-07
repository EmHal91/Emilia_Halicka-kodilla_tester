public class User {
    private int[] user;
    private String name;
    private int age;
    private int sum;
    private int avg;

    public static void main(String[] args) {
        String name = "Emilia";
        int age = 30;
        System.out.println(name);
        System.out.println(age);
    }
    public User(String name, int age) {
        this.user = new int[7];

        User ola = new User("Ola", 18);
        User kasia = new User("Kasia", 21);
        User mariola = new User("Mariola", 27);
        User justyna = new User("Justyna", 30);
        User agnieszka = new User("Agnieszka", 35);
        User przemek = new User("Przemek", 38);
        User tomek = new User("Tomek", 42);

        User[] users = {ola, kasia, mariola, justyna, agnieszka, przemek, tomek};

        System.out.println(name + age);

        }

    private void user(String name, int age) {
        return;
    }

    public int getSum () {
        int sum = 0;
        for (int i = 0; i < user.length; i++) {
            sum = sum + this.user[i];
            this.sum++;
            return sum;
        }
    }
    public int getAverage () {
                int avg = 0;
                avg = sum / user.length;
                System.out.println(avg);
                return (int) avg;

                for (int i = 0; i < this.avg; i++) {
                 age = this.user[i];
                 return this.avg[this.name];
                }
            }


}








