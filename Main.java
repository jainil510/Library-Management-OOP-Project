public class Main {
    public static void main(String[] args) {
        Library library = new Library(5); 
        Librarian librarian = new Librarian("Jainil", library);

        Book b1 = new Book(1, "Java Basics", "Author A");
        Book b2 = new Book(2, "OOP Concepts", "Author B");
        Book b3 = new Book(3, "Data Structures", "Author C");

        librarian.addBook(b1);
        librarian.addBook(b2);
        librarian.addBook(b3);

        librarian.showAllBooks();

        librarian.issueBook(2);
        librarian.returnBook(2);

        librarian.removeBook(1);

        librarian.showAllBooks();
    }
}
