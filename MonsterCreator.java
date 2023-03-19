
/**
 * Write a description of class MonsterCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MonsterCreator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Name and Size of Monster One: ");
        Monster Monster1 = new Monster(input.nextLine(), input.nextInt());
        System.out.println("\n");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Name and Size of Monster Two: ");
        Monster Monster2 = new Monster(input2.nextLine(), input2.nextInt());
        System.out.println("\n");
        
        System.out.println("Monster One's name and size is: " + Monster1);
        System.out.println("Monster Two's name and size is: " + Monster2);
        System.out.println("\ntherefore...");
        Monster1.compareSize(Monster2);

    }
}
