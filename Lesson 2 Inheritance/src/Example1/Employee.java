package Example1;

public class Employee {
    private String name;
    private int empid;

    public Employee() {

        this.name = "";
        this.empid = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpID() {
        return empid;
    }
    public void setCollege(int empid) {
        this.empid = empid;}

    public Employee(String name,int empid) {
        this.name = name;
        this.empid = empid;
    }
    public void greeting(){
        System.out.println("Thanks for joining ABC Company "+this.name);
    }
}
