import java.util.Scanner;
public class  FootballPlayer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Variables declared
        String name;
        int age;
        double height;
        double weight;
        int jersey_number;
        double pound=  0.45359237;
        double meter= 100;

        //Input
        System.out.println("Enter the name : ");
        name =input.nextLine();
        System.out.println("Enter the age: ");
        age =input.nextInt();
        System.out.println("Enter the height (in meters): ");
        height=input.nextDouble();
        System.out.println("Enter the weight (in pounds): ");
        weight=input.nextDouble();
        System.out.println("Enter the jersey number : ");
        jersey_number =input.nextInt();

        //Output1
        System.out.println("Player Name - "+name);
        System.out.println("Age - "+age);
        System.out.println("Height - "+height+"m");
        System.out.println("Weight - "+weight+"lbs");
        System.out.println("Jersy Number - "+jersey_number);

        //conversions
        height=meter*height;
        weight=pound*weight;
        int Weight = (int) weight;

        //Output2
        System.out.println("Player Name - "+name);
        System.out.println("Age - "+age);
        System.out.println("Height - "+height+"cm");
        System.out.println("Weight - "+weighteight+"kg");
        System.out.println("Jersy Number - "+jersey_number);











    }

}