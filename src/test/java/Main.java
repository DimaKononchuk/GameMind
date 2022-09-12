
import java.util.Scanner;
import java.lang.NullPointerException;
public class Main {
    public static void main(String[] args) {
        Menu menu;
        Greet greet;
        Even even;
        Calc calc;
        Progression progression;
        do{
            menu=new Menu();
            switch(menu.getNumber()){
                case (1):{
                    brainGames();
                    greet=new Greet();
                    menu.setNumber(0);

                    break;
                }
                case(2):{
                    brainGames();
                    greet=new Greet();
                    even=new Even();
                    break;

                } case(3):{
                    brainGames();
                    greet=new Greet();
                    calc=new Calc();
                    break;
                } case(4):{
                    System.out.println("Don't game GDC!");
                    break;
                } case(5):{
                    brainGames();
                    greet=new Greet();
                    progression=new Progression();
                    break;
                }

            }
        }while(menu.getNumber()!=0);
    }
    public static void brainGames(){
        System.out.println("Welcome to the Brain Games!");
    }
}
