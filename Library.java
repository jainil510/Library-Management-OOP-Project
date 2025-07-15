public class Library {
    private Book[] books;
    private int capacity;
    private int count;

    public Library(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
        count = 0;
    }

    public Book findBookById(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
        return null;
    }

    public boolean addBook(Book book) {
        if (count < capacity) {
            books[count] = book;
            count++;
            return true;
        }
        return false;
    }

    public boolean removeBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public void showAllBooks() {
        if (count == 0) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < count; i++) {
                books[i].displayInfo();
            }
        }
    }

    public int getCount() {
        return count;
    }
}
