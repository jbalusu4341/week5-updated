public class BookPublication implements BookState {
    Book book;

    public BookPublication(Book book) {
        this.book = book;
    }

    @Override
    public void Publication() {
        System.out.println("Your Book Publication is Start");
    }

    @Override
    public void Print() {
        System.out.println("Your Book Publication is Stop");
    }
}
