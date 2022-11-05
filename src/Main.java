import Task1.Book;
import Task1.Reader;
import Task2.Car;
import Task2.Garage;
import Task2.Truck;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        ArrayList<Book> books = new ArrayList<>() {{
            add(new Book("Приключения", "Диккенс"));
            add(new Book("Словарь", "Петров Иван"));
            add(new Book("Энциклопедия", "Иванов Иван"));
        }};
        Reader reader = new Reader(503271, "Петров В. В.", "Факультет литературы",
                "22.12.1985", "89764548122");

        String[] nameBooks = new String[]{"Приключения", "Словарь", "Энциклопедия"};

        reader.takeBook(3);
        reader.takeBook(nameBooks);
        reader.takeBook(books);

        reader.returnBook(3);
        reader.returnBook(nameBooks);
        reader.returnBook(books);
    }

    public static void task2() {
        Car car = new Car(54000, 240, 0, "Красный", "Автомат", "Порш каен");
        Truck truck = new Truck(125000, 120, 0, "Серый", "Механика",
                600, 5000, 500, "VSG");

        System.out.println(car);
        System.out.println(truck);

        truck.attachTrailer(500);

        truck.detachTrailer();
        System.out.println(truck);

        HashMap<Car, Integer> availability = new HashMap<>();
        availability.put(car, 3);
        availability.put(truck, 1);
        availability.put(new Car(78000, 300, 0, "Желтый", "Робот", "Bugaty"), 10);

        Garage garage = new Garage(availability);
        garage.printAvailabilityCars();
    }
}