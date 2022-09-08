
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Teacher extends Patron {
    Scanner input = new Scanner(System.in);
    public Teacher t;
    int teacherId;

    void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    int getTeacherId() {
        return teacherId;
    }
    void showInfo(){
        System.out.println("Patron ID: "+id);
        System.out.println("Patron Name"+name);
        System.out.println("Department Name"+departmentName);
        System.out.println("Email"+email);
        System.out.println("Contact NO: "+contactNo);
        System.out.println("Address"+address);
    }
    @Override
    public void borrow(Patron p, Book b) {
        File file=new File("Management.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Insert ID No: ");
            String loi = input.next();
            fileWriter.write("TeaherID:"+loi+"\n ");
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
    public void returnBook(Patron p, Book b) {
        File file=new File("Management.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Insert ID No: ");
            String loi= input.next();
            fileWriter.write("TeaherID:"+loi+"\n ");
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
            System.out.println("Fined by Authority");
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
