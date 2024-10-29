public class Test {

    //Null values arent always null
    public int Number1=12 ;
    private int Number2=2 ;
    private int Result = 0;


    //Constructor should be public // Should be the same name as your class
    public Test(int n1, int n2) {

        this.Number1=n1; // This is referring to this classes object.
        this.Number2=n2;

    } // Set and Get, set will set the value for your variable, and get will get the value for your variable.

    public void setNumber2(int number2) {
        Number2 = number2; //Set
    }
    public int getNumber2() {
       return Number2;

    }
    public int getResult() { // Calling the private variable result.
        return Result;
    }
    public Test()
    {
        this.Number1=0 ;
        this.Number2=0 ;
    }
    public int sum(int n1, int n2) { //Operation to find the sum of number1 and number2
        return Result= n1 + n2;
    }
    public int subtract(int n1,int n2){
        return Result= n1 - n2;
    }

    public int multiply(int n1,int n2){
        return Result= n1 * n2;
    }
    public int divide(int n1,int n2){
        return Result= n1 / n2;
    }


}
