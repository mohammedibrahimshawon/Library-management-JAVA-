
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BookOperation extends Book {
    void insertBook(Book b) {
        this.b=b;
        File file = new File("Book.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Input Book ID: ");
            int bookId = input.nextInt();
            setBookId(bookId);
            System.out.println("Input Book Title: ");
            String title = input.next();
            setTitle(title);
            System.out.println("Input Book Subtitle: ");
            String subtitle = input.next();
            setSubTitle(subtitle);
            fileWriter.write(bookId+" "+title+" "+subtitle+" ");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        finally {
            try {
                fileWriter.close();
            }
            catch(IOException io) {
                System.out.println("Exception");
            }
        }
        setAuthor(author);
        setPublisher(publisher);
        System.out.println("Book info: ");
        DisplayInfo();
    }
    Book getBook(int idBook) {
        String searchKey = Integer.toString(idBook);
        File file = new File("Book.txt");
        FileReader fileReader = null;
        BufferedReader bufferreader = null;
        String line = " ";
        try {
            int count = 0;
            fileReader = new FileReader(file);
            bufferreader = new BufferedReader(fileReader);
            while ((line = bufferreader.readLine()) != null) {
                String[] word = line.split(" ");
                String bookId = word[0];
                String title = word[1];
                String subtitle = word[2];
                String authorId = word[3];
                String authorName = word[4];
                String email = word[5];
                String publisherId = word[6];
                String publisherName = word[7];
                String contactNo = word[8];
                if (bookId.equals(searchKey)) {
                    System.out.println("matched!!!!!!");
                    System.out.println("Book info :");
                    System.out.println("    BookID: "+bookId+"    BookTitle: "+title+"    BookSubTitle: "+subtitle+ "    AuthorID: " + authorId + "    AuthorName: " + authorName + "    Email: " + email + "    PublisherID: " + publisherId + "    PublisherName " + publisherName+"    ContactNO: "+contactNo);
                    count++;
                }
            }
            if(count==0) {
                System.out.println("Sorry, There is no Book");
            }
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        finally {
            try {
                fileReader.close();
                bufferreader.close();
            } catch (IOException io) {
                System.out.println("Exception");
            }
        }
        return b;
    }
    void showAllBooks() {
        File file = new File("Book.txt");
        FileReader fileReader = null;
        BufferedReader bufferreader = null;
        String line = " ";
        try {
            fileReader = new FileReader(file);
            bufferreader = new BufferedReader(fileReader);
            while ((line = bufferreader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException io) {
            System.out.println("Exception");
        } finally {
            try {
                fileReader.close();
                bufferreader.close();
            } catch (IOException io) {
                System.out.println("Exception");
            }
        }
    }
}