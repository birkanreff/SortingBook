import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        Book b1 = new Book("Budala", 779, "F. M. Dostoyevski", "1868");
        Book b2 = new Book("Oblomov", 632, "Gorbaçov", "1859");
        Book b3 = new Book("Monte Cristo Kontu", 1552, "A.Dumas", "1844");
        Book b4 = new Book("Sefiller", 1724, "Victor Hugo", "1862");
        Book b5 = new Book("Ilyada", 656, "Homeros", "1957");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);


        System.out.println("ORDER BY NAME:");

        for (Book bookName : books) {
            System.out.println("Book Name: " + bookName.getBookName() +
                    "\nNumber of page: " + bookName.getPageNumber() +
                    "\nAuthor Name: " + bookName.getAuthorName() +
                    "\nReleased Date: " + bookName.getPublishDate());
            System.out.println("********************************");
        }
             System.out.println(" ");
        TreeSet<Book> books1 = new TreeSet<>(new OrderPageNumberComparator());

              books1.add(b1);
              books1.add(b2);
              books1.add(b3);
              books1.add(b4);
              books1.add(b5);



        System.out.println("ORDER BY PAGE:");

        for (Book pageNumber : books1) {
            System.out.println("Book Name: " + pageNumber.getBookName() +
                    "\nNumber of page: " + pageNumber.getPageNumber() +
                    "\nAuthor Name: " + pageNumber.getAuthorName() +
                    "\nReleased Date: " + pageNumber.getPublishDate());
            System.out.println("*******************************");
        }
    }
}