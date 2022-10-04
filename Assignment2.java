import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int diameter, topOfDiamond, bottomOfDiamond, numberOfSpaces;

    System.out.println("Enter a number ");
    diameter = scan.nextInt();
    if (diameter % 2 >= 1) {
    topOfDiamond = 1;
    numberOfSpaces = diameter;
    for (int j=0; j<(numberOfSpaces/2);j++){
        System.out.print(" ");
    }
    while(topOfDiamond <= diameter){
        for (int i=0; i<topOfDiamond; i++){
            System.out.print("*");
        }
        topOfDiamond +=2; numberOfSpaces -=2; System.out.print("\n");
    for (int k=0; k<(numberOfSpaces/2);k++){
        System.out.print(" ");
    }
    }

    topOfDiamond -=4; //sets topOfDiamond value equal to diameter
    bottomOfDiamond = 1;
    while(topOfDiamond >= bottomOfDiamond){
        for (int i=0; i<topOfDiamond; i++){
            System.out.print("*");
        }
    topOfDiamond -=2; System.out.print("\n");
    }
    }


    else {
    System.out.println("*");
    topOfDiamond = 2;
    while(topOfDiamond <= diameter){
        for (int i=0; i<topOfDiamond; i++){
        System.out.print(" *");
        }
        topOfDiamond +=2; System.out.print("\n");
    }
    topOfDiamond -=4; //Does the same thing as the comment above
    bottomOfDiamond = 2;
    while(topOfDiamond >= bottomOfDiamond){
        for (int i=0; i<topOfDiamond; i++){
            System.out.print(" *");
        }
    topOfDiamond -=2; System.out.print("\n");
    }
    System.out.println("*");
    }
}
}
