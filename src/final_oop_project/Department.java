package final_oop_project;

import java.util.ArrayList;

public class Department {
    int dNo;
    String dName;
    ArrayList<Employee> empList;

    public Department() {
    }

    public Department(int dNo, String dName) {
        this.dNo = dNo;
        this.dName = dName;
        this.empList = new ArrayList<>();
    }

    public int getdNo() {
        return dNo;
    }

    public void setdNo(int dNo) {
        this.dNo = dNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    

    public void addEmployee(Employee e){
        empList.add(e);
    }
    
    public void removeEmployee(int indx){
        empList.remove(indx);
    }
    
    public int getEmployeeCount(){
        return empList.size();
    }
    
    public void print_Basics_Data(){
        for(int i = 0; i < empList.size(); i++){
            System.out.println("Name : " + empList.get(i).name + "\nSSN : " + empList.get(i).ssn + 
                               "\nSex : " + empList.get(i).sex + "\n*******************"); 
        }
    }
    
    public void print_All_Details(){
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof SalariedEmployee){
                ((SalariedEmployee) empList.get(i)).displayAllDetails();
                ((SalariedEmployee) empList.get(i)).displayEarnings();
            }
            if(empList.get(i) instanceof HourlyEmployee){
                ((HourlyEmployee) empList.get(i)).displayAllDetails();
                ((HourlyEmployee) empList.get(i)).displayEarnings();
            }
            if(empList.get(i) instanceof CommissionEmployee){
                ((CommissionEmployee) empList.get(i)).displayAllDetails();
                ((CommissionEmployee) empList.get(i)).displayEarnings();
            }
            if(empList.get(i) instanceof BasePlusCommissionEmployee){
                ((BasePlusCommissionEmployee) empList.get(i)).displayAllDetails();
                ((BasePlusCommissionEmployee) empList.get(i)).displayEarnings();
            }
        }
    }
    
    public void print_Earnings(){
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof SalariedEmployee)
                ((SalariedEmployee) empList.get(i)).displayEarnings();
            if(empList.get(i) instanceof HourlyEmployee)
                ((HourlyEmployee) empList.get(i)).displayEarnings();
            if(empList.get(i) instanceof CommissionEmployee)
                ((CommissionEmployee) empList.get(i)).displayEarnings();
            if(empList.get(i) instanceof BasePlusCommissionEmployee)
                ((BasePlusCommissionEmployee) empList.get(i)).displayEarnings();
        }
    }
    
}
