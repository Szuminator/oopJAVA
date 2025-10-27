import books.Book;
import library.Shelf;
public class Zad2 {
    public static void main(String[] args) {
        Book b1 = new Book("Jak przegrałem WW2", "Adolf H.", 1945);
        Book b2 = new Book("Tomek w krainie afrykanskich koszulek", "George W.", 1920);
        Book b3 = new Book("Ksiazka z przyszlosci", "Czarek Ogarek", 2027);

        Shelf shelf = new Shelf();

        shelf.add(b1);
        shelf.add(b2);
        shelf.add(b3);

        for (Book book : shelf.books) {
            System.out.println(book);
        }
    }
}
