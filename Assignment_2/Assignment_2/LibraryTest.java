
class Library {
    void issueBook() {
        System.out.println("Book issued.");
    }
    void returnBook() {
        System.out.println("Book returned.");
    }
}
class LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.issueBook();
        lib.returnBook();
    }
}