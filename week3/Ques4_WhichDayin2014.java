import java.util.Scanner;

public class Ques4_WhichDayin2014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入月份（1-12）: ");
        int month = scanner.nextInt();
        System.out.print("请输入日期（1-31）: ");
        int day = scanner.nextInt();

        // 判断月份日期是否有效
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("输入的月份或日期无效。");
            return; // 结束程序
        }


        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 判断日期是否超过当月的天数
        if (day > daysInMonth[month]) {
            System.out.println("输入的日期超出该月份的天数。");
            return;
        }

        // 计算输入的日期是2014年的第几天
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;

        System.out.printf("2014年%d月%d日是2014年的第%d天。\n", month, day, dayOfYear);

        scanner.close();
    }
}

