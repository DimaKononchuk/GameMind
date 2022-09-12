import java.util.Scanner;

import java.lang.NullPointerException;
public class Menu {
    private Scanner input;
    private int number=0;
    Menu(){
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GDC");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        input=new Scanner(System.in);
        number=input.nextInt();

    }
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
}
