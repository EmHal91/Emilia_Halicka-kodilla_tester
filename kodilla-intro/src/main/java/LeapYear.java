public class LeapYear {
    public static void main(String[] args) {
        System.out.println(); //
        int tenRok = 2021;
        int kolejnyRok = 2022;
        System.out.println(tenRok);
        System.out.println(kolejnyRok);
        {
            if (tenRok % 4 ==0 && tenRok % 100 ==0 && tenRok % 400 ==0) {
            System.out.println("It is a LeapYear");
            } else {
                System.out.println("It is not a LeapYear") ;
        }
         if (tenRok % 4 ==0 && tenRok % 100 !=0) {
             System.out.println("It is a LeapYear");
         }
        }
    }
}