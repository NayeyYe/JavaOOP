import java.util.Scanner;

public class Ques11_MonthDays
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int month ;

        while (true)
        {
            System.out.print("请输入一个1到12之间的整数（代表月份）：");
            month = scanner.nextInt(); // 接受用户输入

            // 验证输入是否在有效范围内
            if (month >= 1 && month <= 12)
            {
                break; // 输入有效，跳出循环
            }
            else
            {
                System.out.println("输入无效，请重新输入！");
            }
        }

        // 使用 switch 语句输出对应月份的天数
        int days;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                // 输出闰年和平年的天数
                System.out.println("2 月的天数：");
                System.out.println("闰年为 29 天，平年为 28 天");
                return;
            default:
                days = 0;
                break;
        }

        System.out.println("月份 " + month + " 的天数为：" + days);
        scanner.close();
    }
}

