package myGame;
import java.util.*;

public class mygame {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Player 1 Enter Your Warrior Name : "); 
        String name1= sc.nextLine(); 

        System.out.print("Player 1 Enter Your Warrior Age : ");
        int age1 = input.nextInt();

        Warrior warrior1 = new Warrior("Warrior "+name1, age1);

        System.out.print("Player 2 Enter Your Warrior Name : "); 
        String name2= sc.nextLine(); 

        System.out.print("Player 2 Enter Your Warrior Age : ");
        int age2 = input.nextInt();
        Warrior warrior2 = new Warrior("Warrior "+name2, age2);

        Monster monster = new Monster("The Monster",20);

        warrior1.walking();
        warrior2.walking();
        monster.walking();

        System.out.println();

        warrior1.checkMobility();
	    warrior2.checkMobility();

        monster.stealStick(warrior2);

        warrior1.checkMobility();
        warrior2.checkMobility();
    }
}
