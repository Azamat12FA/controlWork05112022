package Task2;

public class Truck extends Car {

    private int length, width, trailerСapacity;

    public Truck(int price, int maxSpeed, int currentSpeed, String color,
                 String transmissionType, int length, int width, int trailerСapacity, String name) {
        super(price, maxSpeed, currentSpeed, color, transmissionType, name);
        this.length = length;
        this.width = width;
        this.trailerСapacity = trailerСapacity;
    }

    // Фура может отсоединять прицеп
    public void detachTrailer() {
        this.trailerСapacity = 0;
        // При отсоединении прицепа увеличивается скорость и уменьшается длина фуры.
        // Приведенные формулы используются только, как примеры
        this.length -= 500;
        super.setMaxSpeed(super.getMaxSpeed() * 2);
    }

    // Фура может присоединять прицеп
    public void attachTrailer(int trailerСapacity) {
        if (this.trailerСapacity == 0) {
            this.trailerСapacity = trailerСapacity;
            // При присоединении прицепа уменьшается скорость и увеличивается длина фуры.
            // Приведенные формулы используются только, как примеры
            this.length += 500;
            super.setMaxSpeed(super.getMaxSpeed() / 2);
        } else {
            System.out.println("Невозможно присоеденять к фуре больше одного прицепа");
        }
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getTrailerСapacity() {
        return trailerСapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nДлина - " + length +
                "\nШирина - " + width +
                "\nВместимость прицепа - " + trailerСapacity;
    }
}
