package task17;

import java.io.Serializable;
import java.util.Arrays;


public class Library  implements Serializable {

    private static final long  serialVersionVID = 0010110010100100100L;

     Book[] books = new Book[0];;
      static String libraryName;

      public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    public static void setLibraryName(String libraryName) {
        Library.libraryName = libraryName;
    }


    public void addBook(Book book){
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = book;
        books = newBooks;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
