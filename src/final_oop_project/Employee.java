package final_oop_project;

enum Gender{Male, Female};
public abstract class Employee {
    
    protected String name, address;
    protected int ssn;
    protected Gender sex;
    //=============================================

    //Constructors
    public Employee() {
    }

    public Employee(String name, String adress, int ssn, Gender sex) {
        this.name = name;
        this.address = adress;
        this.ssn = ssn;
        this.sex = sex;
    }
    
    //abstract Methods
    public abstract double earnings();

    
    //Display
    public void print(){
        System.out.println("Name : " + name + '\n' + "Address : " + address + '\n' + 
                           "SSN : " + ssn + '\n' +"Sex : " + sex);
    }
    
    
    //Setter And Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
    
    
    
}
