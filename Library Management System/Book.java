
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Book extends Author implements IBasicOperation{
    Scanner input=new Scanner(System.in);
    public Book b;
    int bookId;
    String title;
    String subtitle;
    Author author;
    Publisher publisher;
    double price;

    void setBookId(int bookId){
       this.bookId=bookId;
    }
    void setTitle(String title){
        this.title=title;
    }
    void setSubTitle(String subtitle){
        this.subtitle=subtitle;
    }
    void setPrice(double price){
        this.price=price;
    }
    void DisplayInfo(){
        System.out.println("Book ID: "+bookId);
        System.out.println("Title: "+title);
        System.out.println("Subtitle: "+subtitle);
        System.out.println("Author Id: "+authorId);
        System.out.println("Author Name: "+authorName);
        System.out.println("Email: "+email);
        System.out.println("Publisher Name: "+publisherId);
        System.out.println("Publisher Name: "+publisherName);
        System.out.println("Contact NO: "+contactNo);
    }
    void setAuthor(Author author) {
        File file = new File("Book.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            this.author = author;
            System.out.println("Input Author ID :");
            int authorId = input.nextInt();
            setAuthorId(authorId);
            getAuthorId();
            System.out.println("Input Name :");
            String authorName = input.next();
            setAuthorName(authorName);
            getAuthorName();
            System.out.println("Input Email :");
            String email = input.next();
            setEmail(email);
            getEmail();
            fileWriter.write(" "+authorId + " " + authorName + " " + email+" ");
        } catch (IOException io) {
            System.out.println("Exception");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException io) {
                System.out.println("Exception");
            }
        }
    }

    void setPublisher(Publisher publisher) {
        File file = new File("Book.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            this.publisher=publisher;
            System.out.println("Input  Publisher ID :");
            int publisherId = input.nextInt();
            setPublisherId(publisherId);
            getPublisherId();
            System.out.println("Input Name :");
            String publisherName = input.next();
            setPublisherName(publisherName);
            getPublisherName();
            System.out.println("Input Contact Number :");
            int contactNo = input.nextInt();
            setContactNo(contactNo);
            getContactNo();
            fileWriter.write(" "+publisherId+" "+publisherName+" "+contactNo+"\n");
        }
        catch(IOException io){
            System.out.println("exception");
        }
        finally {
            try {
                fileWriter.close();
            }
            catch(IOException io) {
                System.out.println("Exception");
            }
        }
    }
    @Override
    public void borrow(Patron p, Book b) {
        File file=new File("Management.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Input Book ID: ");
            String loi=input.next();
            fileWriter.write("BookID: "+loi+"\n ");
        }
        catch(IOException io){
            System.out.println("Exception");
        }
        finally {
            try {
                fileWriter.close();
            }
            catch (IOException io) {
                System.out.println("Exception");
            }
        }
    }
    @Override
    public void returnBook(Patron p, Book b) {
        File file=new File("Management.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Input Book ID: ");
            String loi=input.next();
            fileWriter.write("BookID: "+loi+"\n");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        finally {
            try {
                fileWriter.close();
            }
            catch (IOException io) {
                System.out.println("Exception");
            }
        }
    }

    @Override
    public void fine(Patron p, double amount) {
        File file=new File("Management.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(String.valueOf(amount)+"\n ");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        finally {
            try {
                fileWriter.close();
            }
            catch (IOException io) {
                System.out.println("Exception");
            }
        }
    }
}
