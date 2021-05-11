import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        Double num1=input.nextDouble();
        System.out.println("Please enter the second number");
        Double num2=input.nextDouble();
        System.out.println("Please choose the operations\n1.Add\n2.Subtract\n3.Multiply\n4.Division/n");
        int choice=input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Result:"+(num1+num2));
                break;
            case 2:
                System.out.println("Result:"+(num1-num2));
                break;
            case 3:
                System.out.println("Result:"+(num1*num2));
                break;
            case 4:
                System.out.println("Result:"+(num1/num2));
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
    }
}
