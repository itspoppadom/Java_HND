public class Member {
    public String name;
    public String surname;
    public double miles;
    public Member() {
        name = "";
        surname = "";
        miles = 0;
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
