package interfaces.kodilla.inheritance.homework;

public class Driver extends Job {



    public Driver() {
        super("driving a car, delivery of goods, caring for the car", 3500);
        System.out.println("Driver's duties include" + responsibilities);
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}
