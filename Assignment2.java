import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int diameter, topOfDiamond;

    System.out.println("Enter a number ");
    diameter = scan.nextInt();

    topOfDiamond = 1;
    while(topOfDiamond <= diameter);
    System.out.println ("*" + topOfDiamond);
    topOfDiamond +=2;


    System.out.println("test to see if the program finishes");
    }
}
