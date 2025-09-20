//Ashesi Premier league program

import java.util.Scanner;
public class PlayerSelection
{
     
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Variables declared
        String position;
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

        //conversions
        height=meter*height;
        weight=pound*weight;
        int Weight = (int) weight;

        //category
        boolean risingstar=age<20;
        boolean primeplayer=age>=20||age<=30;
        String Category;


        if (risingstar){
            
            Category="Rising Player";
        }
        else if (primeplayer){
            
            Category="Prime Player";
        }
        else{
            
            Category="Veteran";
        }

        //position and attacker jersey
        String jersey = "Unknown";
        switch (jersey_number) {
            
            case 1:
                jersey="No";
                position="1 = Goalkeeper";
                break;
            case 2 :
            case 5:
                jersey="No";
                position="2/5 = defender";
                break;
            case 6:
            case 8:
                jersey="No";
                position=" 6/8 = midfielder";
            case 7:
                jersey="Yes";
                position="7 = Winger";
            case 9:
                jersey="Yes";
                position="9 = Striker";
                break;
            case 10:
                jersey="No";
                position="10 = Playmaker";
                break;
            case 11:
                jersey="Yes";
                position="11 = Winger";
                break;
            default:
                
                 position="Player position not known";
                break;
        }

        //eligibility
         boolean limit1= age>=18;
         boolean limit2= age<=35;
         boolean limit3= weight <90;
         boolean test=limit1&&limit2&&limit3;
         String eligibility;

        if (test){
            eligibility="Eligible";
            
        }
        else{
            
            eligibility="Not Eligible";
        }


        //Lineup decision
        String starting = "Not in lineup";
        if (primeplayer){

            if (weight<80){
                starting="starting lineup";
            }
            else{ 
                starting="starting lineup";
            }
        }

        //Final Decision
        String decision;
        decision =(test||primeplayer||weight<80) ? "Play" : "Rest";
        

        //Output
        System.out.println("Player: "+name);
        System.out.println("Age : "+age +"("+Category+")");
        System.out.println("Height : "+height+"cm");
        System.out.println("Weight : "+Weight+"kg");
        System.out.println("Position: " + position);
        System.out.println("Attacker Jersey:" + jersey);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + starting);
        System.out.println("Final Decision :"+decision);









    
}
}
