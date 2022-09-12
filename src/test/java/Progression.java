import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Progression {
    private ArrayList<String> array=new ArrayList<String>();
    private Scanner input;
    private int Number;
    private int randNum;

    Progression(){
        int i=0;
        int check=0;
        System.out.println("What number in missing in this progression?");
        input=new Scanner(System.in);
        while(i<3){
            randNum=getRndInteger(0,20);
            setArray(randNum);
            System.out.println("Arrays:");
            getArray(array);
            Number=input.nextInt();
            if(arrayCheck(array,randNum,Number)){
                System.out.println("Correct!");
                i++;
                check++;
            }else{
                System.out.println("InCorrect!");
                i++;
            };

        };
        System.out.println("Result: " +check+" in 3!");
    }
    public void setArray(int index){
        int number=0;
        for(int i=0;i<10;i++){
           array.add(Integer.toString(number));
           number+=index;

        }
        array.set(5,"...");
    }
    public void getArray(ArrayList<String> arr){
        for(String i:arr){
            System.out.print(" "+i+" ");
        }
    }
    public int getRndInteger(int min, int max){
        return (int) (Math.floor(Math.random() * (max - min + 1) ) + min);
    }
    public boolean arrayCheck(ArrayList<String> arrayStr,int randomNum,int inputNum){
        ArrayList<Integer> arrayInt=new ArrayList<Integer>();
        arrayStr.set(5,"0");
        for(String i:arrayStr){
            arrayInt.add(Integer.parseInt(i));
        }
        arrayInt.set(5,inputNum);
        int number=0;
        int result=0;

        if(randomNum==(arrayInt.get(5)-arrayInt.get(4))){
            arrayStr.removeAll(arrayStr);
            return true;
        }else{
            arrayStr.removeAll(arrayStr);
            return false;
        }



    }
}
