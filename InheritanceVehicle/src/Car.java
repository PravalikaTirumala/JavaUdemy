public class Car extends Vehicle {
    private String color;
    private int seats;

    public Car(String steering, int gears, String color, int seats) {
        super(steering, gears);
        this.color = color;
        this.seats = seats;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("car class"+ speed);
    }
}
