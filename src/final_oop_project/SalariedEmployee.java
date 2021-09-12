package final_oop_project;

public class SalariedEmployee extends Employee implements Displayable{
    private double salary, bonus, deductions;

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(double salary, double bonus, double deductions, String name, String adress, int ssn, Gender sex) {
        super(name, adress, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }
    

    @Override
    public double earnings(){
        return (salary + bonus) - deductions;
    }
    
    @Override
    public void displayAllDetails(){
        super.print();
        System.out.println("Salary : " + salary + '\n' + "Bonus : " + bonus + '\n' + "Deductions : " + deductions + '\n');
    }
    
    @Override
    public void displayEarnings(){
        System.out.println("Earnings : " + earnings() + '\n');
    }
}
