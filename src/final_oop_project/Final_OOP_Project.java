package final_oop_project;
public class Final_OOP_Project {

    public static void main(String[] args) {
        Department d1 = new Department(1, "CS");
        
        SalariedEmployee se1 = new SalariedEmployee(8000, 1500, 100, "Ahmed", "Cairo", 29902, Gender.Male);
        SalariedEmployee se2 = new SalariedEmployee(7000, 1000, 150, "Kareem", "Madi", 299652, Gender.Male);
        SalariedEmployee se3 = new SalariedEmployee(5000, 1500, 300, "Fatma", "Cairo", 299962, Gender.Female);
        SalariedEmployee se4 = new SalariedEmployee(3500, 800, 100, "Ibrahim", "Cairo", 29910252, Gender.Male);
        
        HourlyEmployee he1 = new HourlyEmployee(80, 8, "Gaber", "Cairo", 259847, Gender.Male);
        HourlyEmployee he2 = new HourlyEmployee(100, 5, "Ali", "Alex", 589847, Gender.Male);
        HourlyEmployee he3 = new HourlyEmployee(95, 3, "Alaa", "Faiyum", 982, Gender.Female);
        
        CommissionEmployee ce1 = new CommissionEmployee(20000, 0.25, "Mohamed", "Cairo", 8941, Gender.Male);
        CommissionEmployee ce2 = new CommissionEmployee(15000, 0.5, "Kamal", "Ain Shams", 958841, Gender.Male);
        CommissionEmployee ce3 = new CommissionEmployee(20000, 0.8, "Nour", "Cairo", 89418416, Gender.Female);
        
        BasePlusCommissionEmployee b = new BasePlusCommissionEmployee(4000, 150, 0.2, "Walid", "Cairo", 897563, Gender.Male);
        BasePlusCommissionEmployee b2 = new BasePlusCommissionEmployee(5000, 200, 0.5, "Ahmed", "Cairo", 9314563, Gender.Male);
        
        d1.addEmployee(se1);
        d1.addEmployee(se2);
        d1.addEmployee(se3);
        d1.addEmployee(se4);
        d1.addEmployee(he1);
        d1.addEmployee(he2);
        d1.addEmployee(he3);
        d1.addEmployee(ce1);
        d1.addEmployee(ce2);
        d1.addEmployee(ce3);
        d1.addEmployee(b);
        d1.addEmployee(b2);
        
        System.out.println("===============================================");
        System.out.println("Number OF Employee : " + d1.getEmployeeCount());
        System.out.println("===============================================");
        d1.print_Basics_Data();
        System.out.println("===============================================");
        d1.print_All_Details();
        System.out.println("===============================================");
        d1.print_Earnings();
        System.out.println("===============================================");
    }
    
}
