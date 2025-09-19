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

        //Input
        System.out.println("Enter the name : ");
        name =input.nextString();
        System.out.println("Enter the age: ");
        age =input.nextInt();
        System.out.println("Enter the height : ");
        height=input.nextDouble();
        System.out.println("Enter the weight : ");
        weight=input.nextDouble();
        System.out.println("Enter the jersey number : ");
        jersey_number =input.nextInt();

        //Output
        System.out.println("Player Name - "+name);
        System.out.println("Age - "+age);
        System.out.println("Height - "+height+"m");
        System.out.println("Weight - "+weight+"lbs");
        System.out.println("Jersy Number - "+jersey_number)



    }
}