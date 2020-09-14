import java.util.Scanner;
class FactorialByFor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int factorial=1;
        int number = scanner.nextInt();
        for(int i=2; i<=number; i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
    }
}