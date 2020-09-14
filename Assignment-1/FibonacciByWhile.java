import java.util.Scanner;

class FibonacciByWhile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number of fibonacci series you want? : ");
        int seriesNum = scanner.nextInt();
        int first = 0, second=1, fibo = 0, counter=0;
        while(counter<seriesNum){
            fibo = first+second;
            second = first;
            first = fibo;
            System.out.print(" "+fibo);
            counter++;
        }
    }
}