public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(
            "Noli Me Tangere",
            "Jose Rizal",
            "ISBN-001",
            350.00
        );

        Book book2 = new Book(
            "El Filibusterismo",
            "Jose Rizal",
            "ISBN-002",
            320.00
        );

        EBook book3 = new EBook(
            "Florante at Laura",
            "Francisco Balagtas",
            "ISBN-003",
            150.00,
            "PDF"
        );

        Book[] books = {book1, book2, book3};

        System.out.println("===== BOOK INFORMATION =====");

        for (Book book : books) {

            if (book instanceof EBook) {
                System.out.println("===== E-BOOK =====");
            }

            book.displayInfo();
            System.out.println();
        }

        book2.setPrice(299.50);

        System.out.println("===== UPDATED INFORMATION =====");
        System.out.println("Title: " + book2.getTitle());
        System.out.printf("Price: PHP %.2f%n", book2.getPrice());

        book1.applyDiscount(10);

        System.out.println("\n===== AFTER DISCOUNT =====");
        System.out.println("Title: " + book1.getTitle());
        System.out.printf("New Price: PHP %.2f%n", book1.getPrice());

    }
}

