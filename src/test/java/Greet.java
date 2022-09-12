import java.util.Scanner;

public class Greet {
    private String name;
    private Scanner input;
    Greet(){
        System.out.print("May I have your name? ");
        input=new Scanner(System.in);
        name=input.next();
        System.out.println("Hello, "+name);
    }

}
