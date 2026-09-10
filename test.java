class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Driving at " + speed + " km/h");
    }
}

public class test {
    public static void main(String[] args) {
        Car myCar = new Car();  // 'myCar' is an object of class Car
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive();
    }
}