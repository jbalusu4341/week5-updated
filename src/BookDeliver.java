public class BookDeliver implements BookState {
    Book book;

    public BookDeliver(Book book) {
        this.book = book;
    }

    @Override
    public void Publication() {
        System.out.println("Soon Your order will Deliver...");
    }

    @Override
    public void Print() {
        System.out.println("Your book has delivered!");
    }
}
