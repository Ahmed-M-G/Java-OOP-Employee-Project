package final_oop_project;

public class CommissionEmployee extends Employee implements Displayable{
    
    protected double gross_salary, commission_rate;

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(double gross_salary, double commission_rate, String name, String adress, int ssn, Gender sex) {
        super(name, adress, ssn, sex);
        this.gross_salary = gross_salary;
        this.commission_rate = commission_rate;
    }

    public double getGross_salary() {
        return gross_salary;
    }

    public void setGross_salary(double gross_salary) {
        this.gross_salary = gross_salary;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double Commission_rate) {
        this.commission_rate = Commission_rate;
    }
    
    
    @Override
    public double earnings(){
        return gross_salary * commission_rate;
    }
    
    @Override
    public void displayAllDetails(){
        super.print();
        System.out.println("Gross_Salary : " + gross_salary + '\n' + "Commission_Rate : " + commission_rate + '\n');
    }
    
    @Override
    public void displayEarnings(){
        System.out.println("Earnings : " + earnings() + '\n');
    }
}
