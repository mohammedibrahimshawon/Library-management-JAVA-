
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Student extends Patron {
    Scanner input=new Scanner(System.in);
    public Student s;
    int studentId;
    String guardianName;
    int guardianContactNo;

    void setStudentId(int studentId){
        this.studentId=studentId;
    }
    void setGuardianName(String guardianName){
        this.guardianName=guardianName;
    }
    void setGuardianContactNo(int guardianContactNo){
        this.guardianContactNo=guardianContactNo;
    }
    int getStudentId(){
        return studentId;
    }
    String getGuardianName(){
        return guardianName;
    }
    int getGuardianContactNo(){
        return guardianContactNo;
    }

    void showInfo(){
        System.out.println("Patron Id: "+id);
        System.out.println("Patron Name: "+name);
        System.out.println("Department Name: "+departmentName);
        System.out.println("Email: "+email);
        System.out.println("Contact NO"+contactNo);
        System.out.println("Contact No: "+address);
        System.out.println("Guradean NO: "+guardianName);
        System.out.println("Guardean Contact No: "+guardianContactNo);
    }
    @Override
    public void borrow(Patron p, Book b) {
        File file=new File("Management.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Insert ID No: ");
            String loi= input.next();
            fileWriter.write("StudentID:"+loi+"\n ");
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
            fileWriter.write("StudentID:"+loi+"\n ");
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
            System.out.println("Fined by Authorit:");
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
