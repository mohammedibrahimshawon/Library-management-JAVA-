
public interface IBasicOperation{
    void borrow(Patron p, Book b);
    void returnBook(Patron p, Book b);
    void fine(Patron p, double amount);
}