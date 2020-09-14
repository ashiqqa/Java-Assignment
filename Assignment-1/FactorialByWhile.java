import java.util.Scanner;
class FactorialByWhile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial=number, input=number;
        while(input>2){
            factorial*=--input;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
    }
}