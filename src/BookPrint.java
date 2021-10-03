public class BookPrint implements BookState {
    Book book;

    public BookPrint(Book book) {
        this.book = book;
    }

    @Override
    public void Publication() {
        System.out.println("Your Book Printing is Start");
    }

    @Override
    public void Print() {
        System.out.println("Your Book Printing is Done");
    }
}
