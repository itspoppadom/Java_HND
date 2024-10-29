package Example2;

public abstract class Person {
    private String name;
    private String gender;
    private int age;


    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }
    public abstract double calculateStudentFees();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
    return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void personInfo(){
        System.out.println("Name: " + this.name + ", Gender: " + this.gender + ", Age: " + this.age);
    }

}
