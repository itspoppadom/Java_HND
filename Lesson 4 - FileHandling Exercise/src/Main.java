import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Surname: ");
        String surname= sc.nextLine();
        System.out.println("Enter Miles: ");
        double miles = sc.nextDouble();
        Member member1 = new Member(name,surname, miles);

        System.out.println("The first name is: "+member1.getName());
        System.out.println("The surname is: "+member1.getSurname());
        System.out.println("The miles is: "+member1.getMiles());


        member1.writeFile(member1.getName(), member1.getSurname(), member1.getMiles());
        System.out.println("T1");
        member1.readFile();
        System.out.println("T2");
    }
}

/*

        try(Scanner fread=new Scanner(new FileReader("clubread.txt")))

        {
            Member[] members=new Member[100];
            String line;

            int j=0;
            while(fread.hasNext())
            {
                line = fread.nextLine();
                line=line.trim();
                String[] items = line.split(",");
                members[j]=new Member();
                members[j].setName(items[0]);
                members[j].setSurname(items[1]);
                members[j].setMiles(Double.parseDouble(items[2]));
                j++;

            }

            for (int i=0;i<j;i++)
            {
                System.out.println(members[i].getName()+","+members[i].getSurname()+","+members[i].getMiles());
            }
            fread.close();

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}*/