package Example2;

public class Teacher extends Person {
    private int empid;
    private double Salary;

    public Teacher(String name, String gender, int age, int empid, double Salary) {
        super(name, gender, age);
        this.empid = empid;
        this.Salary = Salary;

    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;

    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double Salary) {
        Salary = Salary;
    }
    public void teacherInfo(){
        super.personInfo();
        System.out.println("Teacher Employee ID: " + empid + " Salary: " + Salary);
    }

    @Override
    public double calculateStudentFees() {
        return 0;
    }
}

