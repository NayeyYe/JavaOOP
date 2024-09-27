import java.util.Scanner;

public class Ques2_IsGradePass
{
    public static void  main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade : ");
        int grade = scanner.nextInt();

        if(grade < 0)
        {
            System.out.println("Invalid grade");
        }
        else if (grade < 60)
        {
            System.out.println("不合格");
        }
        else
        {
            System.out.println("合格");
        }
        scanner.close();
    }
}
