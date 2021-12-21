package interfaces.kodilla.inheritance.homework;

public class FirstSystem extends OperatingSystem {
    public FirstSystem (int year) {
        super(year);
        System.out.println("System wydany w 1998 roku");
    }
    public void turnOn (){
        System.out.println("System prawdopodobnie został włączony");
    }
    public void turnOff () {
        System.out.println("System prawdopodobnie został wyłączony");
    }
}
