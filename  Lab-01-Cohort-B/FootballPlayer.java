import java.util.Scanner;
public class  FootballPlayer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Task 1

        //Variables declared
        String name;
        int age;
        double height;
        double weight;
        int jersey_number;
        double pound=  0.45359237;
        double meter= 100;
        int i=1;
        int a=0;

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

        //Task 2

        //conversions
        height=meter*height;
        weight=pound*weight;
        int Weight = (int) weight;

        //Output2
        System.out.println("Player Name - "+name);
        System.out.println("Age - "+age);
        System.out.println("Height - "+height+"cm");
        System.out.println("Weight - "+Weight+"kg");
        System.out.println("Jersey Number - "+jersey_number);

        //Task 3

        //Current age of the player
        System.out.println("The current age is "+ age);

        //Age increased by one
        int new_age= age + i++ ;
        System.out.println(new_age);

        //the jersey number decreases by 1
        int new_jersey_number =  jersey_number + -i;
        System.out.println("The new jersey number is "+ new_jersey_number);

        //updated values
         System.out.println("Age - "+new_age);
         System.out.println("Jersy Number - "+new_jersey_number);

         //Task 4
        
         boolean limit1= age>=18;
         boolean limit2= age<=35;
         boolean limit3= weight <90;
         boolean test=limit1&&limit2&&limit3;

        if (test){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

        boolean limit4 =age<18||weight>=90;

        if (limit4){
            System.out.println("Player has a problem (either too young or too heavy)");
        }

        boolean number3= !test;

        if (number3){
            System.out.println("Not Eligible" );
        }

        //Task 5

        boolean risingstar=age<20;
        boolean primeplayer=age>=20||age<=30;


        if (risingstar){
            System.out.println("Rising Player");
        }
        else if (primeplayer){
            System.out.println("Prime Player");
        }
        else{
            System.out.println("Veteran");
        }

        int jersey_coach;

        System.out.println("Please coach, enter the jersey number");
        jersey_coach =input.nextInt();

        //Task 6

        switch (jersey_coach) {
            case 1:
                System.out.println(" 1 = Goalkeeper");
                break;
            case 2:
                System.out.println(" 2= defender");
                break;
            case 5:
                System.out.println(" 5- defender");
                break;
            case 6:
                System.out.println(" 6 = midfielder");
                break;
            case 7:
                System.out.println("7 = Winger");
                break;
            case 8:
                System.out.println(" 8 = midfielder");
                break;
            case 9:
                System.out.println(" 9 = Striker");
                break;
            case 10:
                System.out.println("10 = Playmaker");
                break;
            case 11:
                System.out.println(" 11 = Winger");
                break;
            default:
                System.out.println("Player position not known");
                break;
        }


        //Task 7
        switch (jersey_coach) {
            case 1:
                System.out.println(" 1 = Goalkeeper");
                break;
            case 2 :
            case 5:
                System.out.println("2/5 = defender");
                break;
            case 6:
            case 8:
                System.out.println(" 6/8 = midfielder"); 
            case 7:
                System.out.println("7 = Winger");
            case 9:
                System.out.println(" 9 = Striker");
                break;
            case 10:
                System.out.println("10 = Playmaker");
                break;
            case 11:
                System.out.println(" 11 = Winger");
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        //Task 8

        if (primeplayer){

            if (weight<80){
                System.out.println("starting lineup");
            }
            else{
                System.out.println("Bench");
            }
        }

        //Task 9
        String decision;
        decision =(test||primeplayer||weight<80) ? "Play" : "Rest";
        System.out.println(decision);

        









    }

}