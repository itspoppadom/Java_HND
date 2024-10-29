package Exercise1;

public class FullTimeEmployee extends Employee {

    private int workingHours;
    public FullTimeEmployee(String name,int paymentPerHour) {
        super(name, paymentPerHour);

    }

    @Override
    public int calculateSalary(){
        return getPaymentPerHour()*8;
    }
}
