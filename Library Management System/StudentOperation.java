
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class StudentOperation extends Student {
    void insertStudent(Student s){
        this.s=s;
        File file=new File("Student.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Insert ID No: ");
            int Id = input.nextInt();
            setId(Id);
            getId();
            System.out.println("Insert Student Name: ");
            String name = input.next();
            setName(name);
            getName();
            System.out.println("Department Name :");
            String departmentName = input.next();
            setDepartmentName(departmentName);
            getDepartmentName();
            System.out.println("Email :");
            String email = input.next();
            setEmail(email);
            getEmail();
            System.out.println("Contact Number :");
            int contactNo = input.nextInt();
            setContactNo(contactNo);
            getContactNo();
            System.out.println("Address :");
            String address = input.next();
            setAddress(address);
            getAddress();
            System.out.println("Guardean Name :");
            String guardianName = input.next();
            setGuardianName(guardianName);
            getGuardianName();
            System.out.println("Guardian Contact Number :");
            int guardianContactNo = input.nextInt();
            setGuardianContactNo(guardianContactNo);
            getGuardianContactNo();
            fileWriter.write(Id+" "+name+" "+departmentName+" "+email+" "+contactNo+" "+address+" "+guardianName+" "+guardianContactNo+"\n");
        }
        catch(IOException io) {
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
            System.out.println("Student info :");
            showInfo();
        }
    Student getStudent(int studentId){
        String searchKey = Integer.toString(studentId);
        File file=new File("Student.txt");
        FileReader fileReader = null;
        BufferedReader bufferreader = null;
        String line=" ";
        try {
            int count=0;
            fileReader = new FileReader(file);
            bufferreader = new BufferedReader(fileReader);
            while((line = bufferreader.readLine()) != null) {
                String[] word = line.split(" ");
                String Id= word[0];
                String name= word[1];
                String departmentName= word[2];
                String email= word[3];
                String contactNo= word[4];
                String address= word[5];
                String guardianName= word[6];
                String guardianContactNo= word[7];
                if(Id.equals(searchKey)) {
                    System.out.println("matched!!!!!!");
                    System.out.println("Student info :");
                    System.out.println("ID: "+Id+"    NAME: "+name+"    DEPTname: "+departmentName+"    Email: "+email+"   ContactNO: "+contactNo+"     Address: "+address+"    GuardianName: "+guardianName+"     Guardian ContactNo: "+guardianContactNo);
                    count++;
                }
            }
            if(count==0) {
                System.out.println("Sorry, There is no student");
            }
        }
        catch (IOException io) {
            System.out.println("Exception");
        }
        finally {
            try {
                fileReader.close();
                bufferreader.close();
            }
            catch(IOException io) {
                System.out.println("Exception");
            }
        }
        return s;
    }
    void showAllStudents( ){
        File file=new File("Student.txt");
        FileReader fileReader = null;
        BufferedReader bufferreader = null;
        String line=" ";
        try {
            fileReader = new FileReader(file);
            bufferreader = new BufferedReader(fileReader);
            while((line = bufferreader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException io) {
            System.out.println("Exception");
        }
        finally {
            try {
                fileReader.close();
                bufferreader.close();
            }
            catch(IOException io) {
                System.out.println("Exception");
            }
        }
    }
}
