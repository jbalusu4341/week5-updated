public class TestClass {
    public static void main(String[] args) {
        Book book = new Book();

        System.out.println(book);
        book.setState(new BookPublication(book));
        book.Publication();

        book.setState(new BookPrint(book));
        book.Publication();
        book.Print();

        book.setState(new BookDeliver(book));
        book.Publication();
        book.Print();

        book.setState(new BookPublication(book));
        book.Print();
    }
}
