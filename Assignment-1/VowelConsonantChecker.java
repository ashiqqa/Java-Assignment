import java.util.Scanner;

class VowelConsonantChecker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char charecter;
        System.out.print("Enter a charecter: ");
        charecter = scanner.next().charAt(0);

        switch(charecter){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'O':
            case 'o':
            case 'u':
            case 'U':
                System.out.println(charecter+" is vowel.");
            break;
            default:
                System.out.println(charecter+" is consonant.");

        }
    }
}