package Task1;

import java.util.ArrayList;

public class Reader {

    int numberReaderTicket;
    String FIO, faculty, dateOfBirth, phone;

    public Reader(int numberReaderTicket, String FIO, String faculty, String dateOfBirth, String phone) {
        this.numberReaderTicket = numberReaderTicket;
        this.FIO = FIO;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.printf("%s взял %s книги\n", getFIO(), count);
    }

    public void takeBook(String[] nameBooks) {
        String names = "";
        for (int i = 0; i < nameBooks.length; i++) {
            names += nameBooks[i];
            if (i != nameBooks.length - 1) {
                names += ", ";
            }
        }
        System.out.printf("%s взял книги: %s\n", getFIO(), names);
    }

    public void takeBook(ArrayList<Book> books) {
        String names = "";
        for (int i = 0; i < books.size(); i++) {
            names += books.get(i).getName();
            if (i != books.size() - 1) {
                names += ", ";
            }
        }
        System.out.printf("%s взял книги: %s\n", getFIO(), names);
    }

    public void returnBook(int count) {
        System.out.printf("%s вернул %s книги\n", getFIO(), count);
    }

    public void returnBook(String[] nameBooks) {
        String names = "";
        for (int i = 0; i < nameBooks.length; i++) {
            names += nameBooks[i];
            if (i != nameBooks.length - 1) {
                names += ", ";
            }
        }
        System.out.printf("%s вернул книги: %s\n", getFIO(), names);
    }

    public void returnBook(ArrayList<Book> books) {
        String names = "";
        for (int i = 0; i < books.size(); i++) {
            names += books.get(i).getName();
            if (i != books.size() - 1) {
                names += ", ";
            }
        }
        System.out.printf("%s вернул книги: %s\n", getFIO(), names);
    }

    public int getNumberReaderTicket() {
        return numberReaderTicket;
    }

    public void setNumberReaderTicket(int numberReaderTicket) {
        this.numberReaderTicket = numberReaderTicket;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
