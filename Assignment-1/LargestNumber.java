import java.util.Scanner;

class LargestNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number1, number2, number3;
        System.out.print("Enter number-1: ");
        number1 = scanner.nextInt();
        System.out.print("Enter number-2: ");
        number2 = scanner.nextInt();
        System.out.print("Enter number-3: ");
        number3 = scanner.nextInt();

        if(number1>number2){
            if(number1>number3){
                System.out.println("Largest number is: "+number1);
            }
            else{
                System.out.println("Largest number is: "+number3);
            }
        }else{
            if(number2>number3){
                System.out.println("Largest number is: "+number2);
            }
            else{
                System.out.println("Largest number is: "+number3);
            }
        }
    }
}