public class Book {
    BookPublication publication;
    BookPrint print;
    BookDeliver deliver;
    BookState state;
    int count = 0;

    public Book() {
        publication = new BookPublication(this);
        print = new BookPrint(this);
        deliver = new BookDeliver(this);
        state = publication;
    }

    public void Publication() {
        state.Publication();
    }

    public void Print() {
        state.Print();
    }

    public BookPublication getPublication() {
        return publication;
    }

    public BookPrint getPrint() {
        return print;
    }

    public BookDeliver getDeliver() {
        return deliver;
    }

    public BookState getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("<<-Book Processing->>");
        if (count != 1) {
            result.append("");
        }
        result.append("\n");
        return result.toString();
    }
}