
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String doi;
        System.out.println("Enter The Email");
        doi=input.next();

        if (doi.equals("ezaz")) {
            int pass;
            System.out.println("Enter The Password");
            pass=input.nextInt();
            while (pass == 123) {
                Student ob = new Student();
                Teacher ob2 = new Teacher();
                Book ob3 = new Book();
                BookOperation ob6 = new BookOperation();
                StudentOperation ob7 = new StudentOperation();
                TeacherOperation ob8 = new TeacherOperation();
                Library_Management_System ob10= new Library_Management_System();
                System.out.println("1.Student Management");
                System.out.println("2.Teacher Management");
                System.out.println("3.Book Management");
                System.out.println("4.Basic Operations");
                System.out.println("5.Exit");
                int q, l;
                q = input.nextInt();
                if (q == 1) {
                    System.out.println("1.Insert New Student");
                    System.out.println("2.Search by StudentId");
                    System.out.println("3.Show All Students");
                    System.out.println("4.Exit");
                    int w;
                    w = input.nextInt();
                    if (w == 1) {
                        System.out.println("How Many Student");
                        l = input.nextInt();
                        for (int i = 0; i < l; i++) {
                            Student s = new Student();
                            ob7.insertStudent(s);
                        }
                    } else if (w == 2) {
                        System.out.println("input the studentid");
                        int poi;
                        poi = input.nextInt();
                        ob7.getStudent(poi);
                    } else if (w == 3) {
                        System.out.println("Information Of All Student");
                        ob7.showAllStudents();
                    } else if (w == 4) {
                        return;
                    }
                } else if (q == 2) {
                    System.out.println("1.Insert New Teacher");
                    System.out.println("2.Search by TeacherId");
                    System.out.println("3.Show All Teachers");
                    System.out.println("4.Exit");
                    int k, m;
                    m = input.nextInt();
                    if (m == 1) {
                        System.out.println("The Number of Teacher");
                        k = input.nextInt();
                        for (int i = 0; i < k; i++) {
                            Teacher t = new Teacher();
                            ob8.insertTeacher(t);
                        }
                    } else if (m == 2) {
                        System.out.println("enter the id");
                        int hop;
                        hop = input.nextInt();
                        ob8.getTeacher(hop);
                    } else if (m == 3) {
                        System.out.println("Information Of All Teacher");
                        ob8.showAllTeachers();
                    } else if (m == 4) {
                        return;
                    }
                } else if (q == 3) {
                    System.out.println("1.Insert New Book");
                    System.out.println("2.Search by BookId");
                    System.out.println("3.Show All Books");
                    int a, e;
                    a = input.nextInt();
                    if (a == 1) {
                        System.out.println("How Many Books: ");
                        e = input.nextInt();
                        for (int i = 0; i < e; i++) {
                            Book b = new Book();
                            ob6.insertBook(b);
                        }
                    } else if (a == 2) {
                        System.out.println("enter THe Id");
                        int yop;
                        yop = input.nextInt();
                        ob6.getBook(yop);
                    } else if (a == 3) {
                        ob6.showAllBooks();
                    }
                } else if (q == 4) {
                    System.out.println("1.Borrow Book");
                    System.out.println("2.Return Book");
                    System.out.println("3.Add Fine");
                    Book b = new Book();
                    int h;
                    h = input.nextInt();
                    if (h == 1) {
                        System.out.println("1. Student");
                        System.out.println("2. Teacher");
                        int c = input.nextInt();
                        if (c == 1) {
                            System.out.println("Info of Student who Borrowed Book");
                            Patron p = new Student();
                            ob.borrow(p, b);
                            ob3.borrow(p, b);

                        } else if (c == 2) {
                            System.out.println("Info of Teacher who Borrowed Book");
                            Patron p = new Teacher();
                            ob2.borrow(p, b);
                            ob3.borrow(p, b);
                        }
                    }
                    if (h == 2) {
                        System.out.println("1.Student");
                        System.out.println("2.Teacher");
                        int c = input.nextInt();
                        if (c == 1) {
                            System.out.println("Info of Student who Returned Book");
                            Patron p = new Student();
                            ob.returnBook(p, b);
                            ob3.returnBook(p, b);

                        } else if (c == 2) {
                            System.out.println("Info of Student who Returned Book");
                            Patron p = new Teacher();
                            ob2.returnBook(p, b);
                            ob3.returnBook(p, b);
                        }
                    }
                    if (h == 3) {
                        System.out.println("1.Student");
                        System.out.println("2.Teacher");

                        int c = input.nextInt();
                        if (c == 1) {
                            System.out.println("Info of Student who got Fined");
                            Patron p = new Student();
                            System.out.println("Add fine: ");
                            double amount = input.nextDouble();
                            ob.fine(p, amount);
                            ob.returnBook(p, b);
                            ob3.returnBook(p, b);
                        } else if (c == 2) {
                            System.out.println("Info of Teacher who got Fined");
                            Patron p = new Teacher();
                            System.out.println("Add fine: ");
                            double amount = input.nextDouble();
                            ob2.fine(p, amount);
                            ob2.returnBook(p, b);
                            ob3.returnBook(p, b);
                        }
                    }
                } else if (q == 5) {
                    return;
                }
            }
        }
    }
}
