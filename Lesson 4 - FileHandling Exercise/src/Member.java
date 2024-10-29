import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Member{

    public String name;
    public String surname;
    public double miles;
    public String s;

    public Member(String name,String surname, double miles) {
        this.name = name;
        this.surname = surname;
        this.miles = miles;
    }
    public void setMiles(double miles) {
        this.miles = miles;
    }

    public void setName(String name) {
            this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMiles() {
        return miles;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    public void writeFile(String name, String surname, double miles) {

        try (FileWriter file = new FileWriter ("club.txt", true)){
            String s =  name + "," + surname + "," + miles + "\n";
            file.write(s);
            System.out.println("Successfully written to file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFile(){

        try (Scanner fread=new Scanner(new FileReader("club.txt"))) {
            Member[] members = new Member[100];
            String line;

            int j = 0;
            while (fread.hasNext()){
                line = fread.nextLine();
                line = line.trim();
                String[] items = line.split(",");
                members[j] = new Member(items[0],items[1],Double.parseDouble(items[2]));
                j++;
            }

            for (int i=0;i<j;i++){
                System.out.println(members[i].getName() + "," + members[i].getSurname() + "," + members[i].getMiles());
            } fread.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

/*//Azam
//05/11
//Class member to save members data

// Appended by Dominic / 05/11/24
public class Member {
    String name;
    String surname;
    double miles;
    public Member()
    {
        name="";
        surname="";
        miles=0;
    }
    public void setMiles(double miles) {
        this.miles = miles;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getMiles() {
        return miles;
    }

}*/
