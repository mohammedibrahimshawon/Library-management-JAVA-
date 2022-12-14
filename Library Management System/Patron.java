
public abstract class Patron implements IBasicOperation {

    int id;
    String name;
    String departmentName;
    String email;
    int contactNo;
    String address;
    double amount;

    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    void setEmail(String email){
        this.email=email;
    }
    void setContactNo(int contactNo){
        this.contactNo=contactNo;
    }
    void setAddress(String address){
        this.address=address;
    }
    void setAmount(double amount){
       this.amount=amount;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getDepartmentName(){
        return departmentName;
    }
    String getEmail(){
        return email;
    }
    int getContactNo(){
        return contactNo;
    }
    String getAddress(){
        return address;
    }
    double getAmount(){
        return amount;
    }
    abstract void showInfo();
}
