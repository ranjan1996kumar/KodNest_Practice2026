package Default;

class BookInteraction {
    public void performAction() {
        System.out.println("Performing book interaction...");
    }
}

class CheckAvailability extends BookInteraction {
    public void performAction() {
        System.out.println("Checking book availability...");
    }
}

class Borrow extends BookInteraction {
    public void performAction() {
        System.out.println("Borrowing a book...");
    }
}

class Return extends BookInteraction {
    public void performAction() {
        System.out.println("Returning a book...");
    }
}