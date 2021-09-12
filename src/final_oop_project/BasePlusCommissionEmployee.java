package final_oop_project;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double base;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(double base, double gross_salary, double commission_rate, String name, String adress, int ssn, Gender sex) {
        super(gross_salary, commission_rate, name, adress, ssn, sex);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double earnings(){
        return base * super.earnings();
    }
    
    @Override
    public void displayAllDetails(){
        super.displayAllDetails();
        System.out.println("Base : " + base + '\n');
    }
    
    @Override
    public void displayEarnings(){
        System.out.println("Earnings : " + earnings() + '\n');
    }
    
}
