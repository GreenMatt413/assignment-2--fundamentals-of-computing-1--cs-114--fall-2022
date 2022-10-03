import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int diameter, topOfDiamond, bottomOfDiamond;

    System.out.println("Enter a number ");
    diameter = scan.nextInt();

    topOfDiamond = 1;
    while(topOfDiamond <= diameter){
    System.out.println ("*" + topOfDiamond);
    topOfDiamond +=2;
    }
    topOfDiamond -=4; //sets topOfDiamond value equal to diameter
    bottomOfDiamond = 1;
    while(topOfDiamond >= bottomOfDiamond){
    System.out.println ("*" + topOfDiamond);
    topOfDiamond -=2;
    }
    }
}
