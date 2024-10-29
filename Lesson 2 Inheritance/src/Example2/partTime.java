package Example2;

public class partTime extends Student{
    public partTime( String name, String gender,int age, String StudentID, double StudentFees, boolean fullTime){
        super(name, gender, age, StudentID, StudentFees,fullTime);
    }
    public double StudentFees;
    @Override
    public double calculateStudentFees() {
        if (!fullTime) StudentFees =  getStudentFees() * 0.5;
        return StudentFees;
    }
}
