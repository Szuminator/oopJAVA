package library;
import books.Book;

import java.util.ArrayList;
public class Shelf {
    public ArrayList<Book> books = new ArrayList<Book>();

    public void add(Book book){
        books.add(book);
    }

    public void remove(Book book){
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
