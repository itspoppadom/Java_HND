package Example2;

public abstract class Student extends Person {
    private String StudentID;
    private double StudentFees;
    public boolean fullTime;

    public Student(String name, String gender,int age, String StudentID, double StudentFees, boolean fullTime) {
        super(name, gender, age);
        this.StudentID = StudentID;
        this.StudentFees = StudentFees;
        this.fullTime = fullTime;
    }
    public String getStudentID() {
        return StudentID;

    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    public int getStudentFees() {
        return (int) StudentFees;
    }
    public void setStudentFees(double StudentFees) {
        this.StudentFees = StudentFees;
    }
    public void StudentInfo(){
            super.personInfo();
            System.out.println("\nStudent ID: " + StudentID + "\nFees : " + this.StudentFees);
    }
}

