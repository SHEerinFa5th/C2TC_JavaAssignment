package Assignment_3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add Books
        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Effective Java", "Joshua Bloch");

        // Add Magazines
        Magazine m1 = new Magazine(201, "Tech Today", 45);
        Magazine m2 = new Magazine(202, "AI Monthly", 12);

        // Add items to library
        library.addItem(b1);
        library.addItem(b2);
        library.addItem(m1);
        library.addItem(m2);

        // Show all items
        library.showAllItems();
    }
}
