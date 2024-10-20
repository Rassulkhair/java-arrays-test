import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        Book book1 = new Book("Преступление и наказание", "Федор Достоевский", 550);
        Book book2 = new Book("Степной волк", "Герман Гессе", 250);

        books[0] = book1;
        books[1] = book2;
        ArraysEngine arrays = new ArraysEngine();
        arrays.printAllBooks(books);

        System.out.println("Всего имеется " + arrays.getActualSize(books) + " книг");
        System.out.println("Общее количество страниц: " + arrays.countTotalPages(books));

    }
}