import java.util.Scanner;

public class Calc {
    private int num1,num2;
    private int checkSymbl;
    private int number;
    private Scanner input;
    private int check;
    Calc(){
        int i=0;

        input=new Scanner(System.in);

        System.out.println("What is result of the expression?");

        while(i<3){
            num1=getRndInteger(0,100);
            num2=getRndInteger(0,100);
            checkSymbl=getRndInteger(1,4);
            System.out.print("Question:"+num1+getCheckSymbl(checkSymbl)+num2+"=");
            number=input.nextInt();
            if(number==numInteger(num1,num2,checkSymbl)){
                System.out.println("Correct!");
                i++;
                check++;
            }else{
                System.out.println("InCorrect!");
                i++;
            }

        }
        System.out.println("Result: " +check+" in 3!");
    }
    public int getRndInteger(int min, int max){
        return (int) (Math.floor(Math.random() * (max - min + 1) ) + min);
    }
    public int  numInteger(int num1,int num2,int checkSymbl){
        if(checkSymbl==1){
            return num1*num2;
        }else if(checkSymbl==2){
            return num1-num2;
        }else if(checkSymbl==3){
            return num1*num2;
        }else if(checkSymbl==4){
            return num1/num2;
        }
       return 1;

    };
    public String getCheckSymbl(int checkSymbl){
        if(checkSymbl==1){
            return "+";
        }else if(checkSymbl==2){
            return "-";
        }else if(checkSymbl==3){
            return "*";
        }else if(checkSymbl==4){
            return "/";
        }
        return " ";
    }
}
