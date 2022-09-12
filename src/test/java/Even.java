import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NullPointerException;
import java.lang.Math;
public class Even {
    private Scanner input;
    private String string;

    private int check=0;
    private int i=0;
    Even(){
        System.out.println("Answer 'yes' if number steamy otherwise answer 'no'");
        while(i<3){
            int number= 0;
            number=getRndInteger(0,100);
            System.out.println("Answer: "+ number);
            input=new Scanner(System.in);
            do{
                System.out.print("Your choise: ");
                string=input.next();
                string=string.toLowerCase();
                if(string.equals("yes")|| string.equals("no")){
                    break;
                }

            }while(true);
            if(checkNumber(number)==checkString(string)){
                System.out.println("Correct!");
                check++;
                i++;
            }else{
                System.out.println("InCorrect!");
                i++;
            };

        }
        System.out.println("Result: " +check+" in 3!");


    }
    public String getString(){
        return string;
    };
    public boolean checkNumber(int index){
        if(index % 2==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkString(String str){
        if(str.equals("yes")){
            return true;
        };
        return false;
    }
    public int getRndInteger(int min, int max){
        return (int) (Math.floor(Math.random() * (max - min + 1) ) + min);
    }
}
