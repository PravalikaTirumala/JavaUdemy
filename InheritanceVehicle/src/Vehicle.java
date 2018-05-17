public class Vehicle {
    private String steering;
    private int gears;

    public Vehicle(String steering, int gears) {
        this.steering = steering;
        this.gears = gears;
    }

    public String getSteering() {
        return steering;
    }

    public int getGears() {
        return gears;
    }
    public void move(int speed){
        System.out.println("vehicle class "+speed);
    }
}



