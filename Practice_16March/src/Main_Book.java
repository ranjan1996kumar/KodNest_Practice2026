class Book {
    String title;
    int page;
    String author;

    public Book(String title, int page, String author) {
        this.title = title;
        this.page = page;
        this.author = author;
    }

    public Book(Book b) {   // Copy Constructor
        this.title = b.title;
        this.page = b.page;
        this.author = b.author;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Number of Pages : " + page);
        System.out.println("Author of the book: " + author);
    }
}

public class Main_Book {
    public static void main(String[] args) {

        Book b1 = new Book("Full Stack", 300, "Satish");
        b1.display();
        System.out.println("----------");

        Book b2 = new Book(b1);
        b2.display();
        System.out.println("----------");

        Book b3 = new Book(b1);
        b3.display();
    }
}

