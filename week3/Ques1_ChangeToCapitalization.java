import java.util.Scanner;

public class Ques1_ChangeToCapitalization
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一串字母：");
        char inputChar = scanner.next().charAt(0);

        switch (inputChar)
        {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
                break;
        }

        scanner.close();
    }
}
