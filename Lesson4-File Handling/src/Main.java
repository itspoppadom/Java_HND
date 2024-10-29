import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {

        Member member1 = new Member();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        member1.setName(sc.nextLine());
        System.out.println("Enter Surname: ");
        member1.setSurname(sc.nextLine());
        System.out.println("Enter Miles: ");
        member1.setMiles(sc.nextDouble());


        System.out.println("The first name is: "+member1.getName());
        System.out.println("The surname is: "+member1.getSurname());
        System.out.println("The miles is: "+member1.getMiles());


        try {
            FileWriter file = new FileWriter("club.txt");
            String s = member1.getName() + "," + member1.getSurname() + "," + member1.getMiles();
            file.write(s);
        } catch (IOException e) {
            System.out.println(e);
        }
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
        try (Scanner fread=new Scanner(new FileReader("club.txt"))) {
            Member[] members = new Member[100];
            String line;

            int j = 0;
            while (fread.hasNext()){
                line = fread.nextLine();
                line = line.trim();
                String[] items = line.split(",");
                members[j] = new Member();
                members[j].setName(items[0]);
                members[j].setSurname(items[1]);
                members[j].setMiles(Double.parseDouble(items[2]));
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