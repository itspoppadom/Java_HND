package Exercise1;

    public class Contractor extends Employee {
        private int workingHours;
    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;

    }
    public int getWorkingHours() {
        return workingHours;

    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;

    }
    @Override
    public int calculateSalary(){
     return getPaymentPerHour() * workingHours;
    }

}
