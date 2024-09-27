import java.util.Scanner;
public class Ques3_WhichSeason
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份: ");
        int month = sc.nextInt();

        if (month == 12 || month == 1 || month ==2)
        {
            System.out.println("冬季");
        }
        else if(month == 3 || month == 4 || month ==5)
        {
            System.out.println("春季");
        }
        else if (month == 6 || month == 7 || month ==8)
        {
            System.out.println("夏季");
        }
        else if (month == 9 || month == 10 || month ==11)
        {
            System.out.println("秋季");
        }
        else
        {
            System.out.println("输入错误");
        }
        sc.close();
    }
}
