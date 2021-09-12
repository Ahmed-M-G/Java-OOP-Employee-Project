package final_oop_project;

public class HourlyEmployee extends Employee implements Displayable{
    private double hour_rate;
    private int no_of_hours;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(double hour_rate, int no_of_hours, String name, String adress, int ssn, Gender sex) {
        super(name, adress, ssn, sex);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }
    
    @Override
    public double earnings(){
        return no_of_hours * hour_rate;
    }
    
    @Override
    public void displayAllDetails(){
        super.print();
        System.out.println("No_Of_Hours : " + no_of_hours + '\n' + "Hour_Rate : " + hour_rate + '\n');
    }
    
    @Override
    public void displayEarnings(){
        System.out.println("Earnings : " + earnings() + '\n');
    }
    
    
}
