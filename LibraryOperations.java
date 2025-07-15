public interface LibraryOperations {
    void addBook(Book book);
    void removeBook(int id);
    void issueBook(int id);
    void returnBook(int id);
    void showAllBooks();
}
