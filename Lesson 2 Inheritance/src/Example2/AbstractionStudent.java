package Example2;

public class AbstractionStudent {
    public static void main(String[] args) {
        Person fullTimeStudent = new fullTime("Dominic", "Male",25,"30087241",8000.00, true);
        Person partTimeStudent = new partTime("Dominic", "Male",25,"30087241", 8000.00, false);
        System.out.println(fullTimeStudent.getName(),fullTimeStudent.,fullTimeStudent.calculateStudentFees());
        System.out.println(partTimeStudent.calculateStudentFees());
    }
}
