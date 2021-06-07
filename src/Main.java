public class Main {
    public static void main(String[] args) {
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        bookBorrower2.borrowBook();

        System.out.println(bookBorrower1.getAuthorAndTitle());
    }
}
