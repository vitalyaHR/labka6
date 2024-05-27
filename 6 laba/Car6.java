abstract class Car6 {

    String model;
    String color;
    int maxSpeed;

    public Car6(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void brake();

    public void gas() {
        System.out.println("Lets's go!");
    }
}