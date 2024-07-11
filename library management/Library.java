public class Library {
    private LibraryItem[] items;
    private int itemCount;

    public Library(int size) {
        items = new LibraryItem[size];
        itemCount = 0;
    }

    public void addItem(LibraryItem item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Library is full. Cannot add more items.");
        }
    }

    public void displayAllItems() {
        for (int i = 0; i < itemCount; i++) {
            items[i].displayInfo();
        }
    }

    public static void main(String[] args) {
        Library library = new Library(10);

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addItem(book1);
        library.addItem(book2);

        library.displayAllItems();
    }
}
