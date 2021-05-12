import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;
public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=input.nextInt();
        System.out.println("Please enter the second number");
        int num2=input.nextInt();
        System.out.println("Please choose the operations\n1.Add\n2.Subtract\n3.Multiply\n4.Division/n");
        int choice=input.nextInt();
        Calculations calculations=new Calculations();
        switch (choice){
            case 1:
                calculations.Addition(num1,num2);
                break;
            case 2:
                calculations.Subtraction(num1,num2);
                break;
            case 3:
                calculations.Multiplication(num1,num2);
                break;
            case 4:
                calculations.Division(num1,num2);
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
    }
}

class Calculations{
    public int Addition(int num1, int num2){
        System.out.println("Result:"+(num1+num2));
        return (num1+num2);
    }
    public int Subtraction(int num1,int num2){
        System.out.println("Result:"+(num1-num2));
        return (num1-num2);
    }
    public int Multiplication(int num1,int num2){
        System.out.println("Result:"+(num1*num2));
        return (num1*num2);
    }
    public int Division(int num1,int num2){
        System.out.println("Result:"+(num1/num2));
        return (num1/num2);
    }
}

