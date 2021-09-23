public class LeapYear {
    public static void main(String[] args) {
        System.out.println("It is a LeapYear!"); //
        int tenRok = 2021;
        int kolejnyRok = 2022;
        System.out.println(tenRok);
        System.out.println(kolejnyRok);
        {
            if (tenRok % 4 && tenRok % 100 && tenRok % 400) {
            System.out.println("It is a LeapYear");
            } else {
                System.out.println("It is not a LeapYear") ;
        }
         if (tenRok % 4 && tenRok %100) {
             System.out.println("It is a LeapYear");
         }
        }
    }
}