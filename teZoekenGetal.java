import java.util.Scanner;

public class teZoekenGetal
{

    public  static  int a,b,c,tezoeken = 50;


    public static String naam;
    //public  static Scanner gok = new Scanner(System.in);

    public static void main(String[] args) {


        int product =1;
        int i = 1;

        System.out.println("Wat is jou naam?: ");
        Scanner gok = new Scanner(System.in);
        naam = gok.nextLine();
        System.out.println("Welkom "+naam);

        while( i < 3)

       {

           System.out.println("Geef een getal:");
           a = gok.nextInt();
           product = product * a;

           i++;

       }




       System.out.println("Product is :" + product);






    }
}
