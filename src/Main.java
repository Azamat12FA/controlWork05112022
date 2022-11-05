import Task1.Book;
import Task1.Reader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task1();
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
}