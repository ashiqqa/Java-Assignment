import java.util.Scanner;

class NegativePositiveChecker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if(number>0){
            System.out.println(number+" is positive");
        }
        else if(number<0){
            System.out.println(number+" is negative");
        }
        else
        {
            System.out.println(number+" is neither positive or negative");
        }
    }
}