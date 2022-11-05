package Task2;

public class Car {

    private int price, maxSpeed, currentSpeed;
    private String name, color, transmissionType;

    public Car(int price, int maxSpeed, int currentSpeed, String color, String transmissionType, String name) {
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.transmissionType = transmissionType;
        this.name = name;
    }

    public void start() {

    }

    public void stop() {

    }

    @Override
    public String toString() {
        return name +
                "\nЦена=" + price +
                "\nМаксимальная скорость=" + maxSpeed +
                "\nТекущая скорость=" + currentSpeed +
                "\nЦвет=" + color +
                "\nКоробка передач=" + transmissionType;
    }

    public void accelerate (int speed) {
        this.currentSpeed += speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getName() {
        return name;
    }
}
