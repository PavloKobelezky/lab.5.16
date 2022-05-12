import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fortune, atp1, atp2;

        fortune = (int)(Math.random()*3)+1;
        System.out.println(fortune);

        System.out.println("Welcome!");
        System.out.println("Can you guess my number? I have one number from 1 to 3. ");
        System.out.println("You have 2 attempts.");
        System.out.println("Good luck!");

        System.out.print("Your number: ");
        atp1 = sc.nextInt();

        if (atp1 != fortune) {
            System.out.println("Your bad");

            System.out.print("Your last chance: ");
            atp2 = sc.nextInt();

            if (atp2 != fortune) {
                System.out.println("You lose!");
                System.out.print(" Game over!");
                //Losing, Game over.

            }else {
                System.out.println("You win! Game over!");
            }

        }else{
            System.out.println("You win!");
            System.out.println(" Game over!");
        }



    }
}

