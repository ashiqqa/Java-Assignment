import java.util.Scanner;

class FibonacciByFor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number of series you want? : ");
        int seriesNum = scanner.nextInt();
        int first = 0, second=1, fibo=0;

        for(int i=0; i<seriesNum; i++){
                fibo = first+second;
                second = first;
                first = fibo;
                System.out.print(" "+fibo);
        }

    }
}