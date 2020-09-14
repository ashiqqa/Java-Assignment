import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        double number1, number2, result=0;
        char operator;
        int status;
        while(isContinue){
            System.out.print("Enter Number-1: ");
            number1 = scanner.nextDouble();
            System.out.print("Enter Operator (+,-,*,/,%): ");
            operator = scanner.next().charAt(0);
            System.out.print("Enter Number-2: ");
            number2 = scanner.nextDouble();
            switch(operator){
                case '+':
                    result = number1+number2;
                    break;
                case '-':
                    result = number1-number2;
                    break;
                case '*':
                    result = number1*number2;
                    break;
                case '/':
                    result = number1/number2;
                    break;
                case '%':
                    result = number1%number2;
                    break;
                default:
                    System.out.println("Invalid operator, Calculation failed.");
            }
            System.out.println(number1+" "+operator+" "+number2+" = "+result);
            System.out.println("Press 1 to continue...");
            status = scanner.nextInt();
            isContinue  = status==1;
        }
    }
}