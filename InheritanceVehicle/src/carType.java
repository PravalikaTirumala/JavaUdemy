public class carType extends Car {
    private String model;
    private int year;

    public carType(String steering, int gears, String color, int seats, String model, int year) {
        super(steering, gears, color, seats);
        this.model = model;
        this.year = year;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("car type class"+ speed);
    }
}
