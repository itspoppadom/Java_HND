package Exercise1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ramesh", "BVB");
        Student student2 = new Student("Prakash", "GEC");
        Student student3 = new Student("Pramod", "IIT");


    System.out.println(student.getName()+student.getCollege());
    System.out.println(student2.getName()+student2.getCollege());
    System.out.println(student3.getName()+student3.getCollege());}

}
