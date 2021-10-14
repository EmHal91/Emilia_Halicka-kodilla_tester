public class User {
    private String name;
    private int age;

    public static void main(String[] args) {
        String name = "Emilia";
        int age = 30;
        User ola = new User("Ola", 18);
        User kasia = new User("Kasia", 21);
        User mariola = new User("Mariola", 27);
        User justyna = new User("Justyna", 30);
        User agnieszka = new User("Agnieszka", 35);
        User przemek = new User("Przemek", 38);
        User tomek = new User("Tomek", 42);

        User[] users = {ola, kasia, mariola, justyna, agnieszka, przemek, tomek};
        double avg = getAverage(users);
        for (User user: users) {
            if (user.age< avg) {
                System.out.println(user.name);
            }
        }

        System.out.println(name);
        System.out.println(age);
    }

    public User(String name, int age) {
        this.name = name;
        this.age= age;

        System.out.println(name + age);

    }
    private void user(String name, int age) {

        return;
    }
    public static int getSum(User[] users ) {
        int sum = 0;

        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        System.out.println("Suma wieku wynosi" + sum);
        return sum;

    }
    public static double getAverage(User[] users) {
        return getSum(users)/users.length;
    }

    }








