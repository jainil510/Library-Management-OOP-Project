public class Librarian implements LibraryOperations {
    private String name;
    private Library library;

    public Librarian(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    @Override
    public void addBook(Book book) {
        if (library.addBook(book)) {
            System.out.println("Book added by " + name + ": " + book.getTitle());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    @Override
    public void removeBook(int id) {
        if (library.removeBook(id)) {
            System.out.println("Book removed by " + name + ": ID " + id);
        } else {
            System.out.println("Book not found!");
        }
    }

    @Override
    public void issueBook(int id) {
        Book book = library.findBookById(id);
        if (book != null && !book.isIssued()) {
            book.issue();
            System.out.println("Book issued: " + book.getTitle());
        } else {
            System.out.println("Cannot issue. Book not available or already issued.");
        }
    }

    @Override
    public void returnBook(int id) {
        Book book = library.findBookById(id);
        if (book != null && book.isIssued()) {
            book.returnBook();
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("Cannot return. Book not issued or not found.");
        }
    }

    @Override
    public void showAllBooks() {
        library.showAllBooks();
    }
}
