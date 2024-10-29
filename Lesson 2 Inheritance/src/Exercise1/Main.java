package Exercise1;

public class Main {
    public static void main(String[] args) {
        Employee contractor = new Contractor("Contractor", 10,10);

        Employee fullTimeEmployee = new FullTimeEmployee("F T Employee", 8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
        }
    }
