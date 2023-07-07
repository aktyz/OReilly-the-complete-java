package Section7;

public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Martin",
                "Game of Thrones",
                "Fantasy",
                864
        );
        Book mathBook = new Book("James Stewart",
                "Calculus",
                "Math",
                1392
        );
        Book javaBook = new Book("Joel Murach",
                "Murach's Java Programming",
                "Programming",
                800
        );

        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
    }
}
