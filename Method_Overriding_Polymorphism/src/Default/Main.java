package Default;

public class Main {
    public static void main(String[] args) {
        BookInteraction check = new CheckAvailability();
        check.performAction();  

        BookInteraction borrow = new Borrow();
        borrow.performAction();  

        BookInteraction returnBook = new Return();
        returnBook.performAction();  
    }
}