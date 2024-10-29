public class Main {
    public static void main(String[] args) { //From our class Test we want to create an object out of it

        Test t1=new Test(15,5);//Constructor needs two numbers to run. Any time you want access to an a=obejct you write name of the object as object.attribute or object.method.

        System.out.println(t1.Number1);//Constructor can access Number 1 because it is a public object
        t1.Number1=24;
        System.out.println("The Number 1 is:" + t1.Number1);

        //t1.getNumber2(); //Will Return to No where *Dont call Number 2 this way
        System.out.println("The number 2 is:" + t1.getNumber2());//Because Number 2 is private you need to us the set and get function to retrieve access.
        //To change the value of the private number we need to use our Set Function
        t1.setNumber2(78); //Set and Get are Accessor Methods necessary for the use of Constructor.
        System.out.println("The Number 2 is:" + t1.getNumber2());


        Test t2 = new Test(); //'Number 1 of object t2 is=
        System.out.println(t2);
        t2.Number1=13;
        System.out.println("\nThe Number 1 is:" + t2.Number1);// End Of Class Example
        //

        Test t3 = new Test(4,5);
        System.out.println(t3);
        t3.setNumber2(5);
        System.out.println("The Number 2 is:" + t3.getNumber2()+" .");
        t3.sum(6,7);
        System.out.println("The sum of two numbers is: " + t3.getResult());
        t3.subtract(10,5);
        System.out.println("The subtraction of two numbers is: " + t3.getResult());
        t3.multiply(10,5);
        System.out.println("The multiplication of two numbers is: " + t3.getResult());
        t3.divide(10,5);
        System.out.println("The division of two numbers is: " + t3.getResult());



    }
}
