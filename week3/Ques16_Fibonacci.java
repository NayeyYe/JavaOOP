import java.util.Scanner;

public class Ques16_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入月份 n: ");
        int n = scanner.nextInt(); // 输入想要计算的月份

        if (n <= 0) {
            System.out.println("月份必须大于0");
            return;
        }

        // 创建数组来存储每个月兔子数量
        long[] rabbits = new long[n+1];

        // 初始化前两个值
        rabbits[1] = 1; // 第1个月
        if (n > 1) {
            rabbits[2] = 1; // 第2个月
        }

        // 计算每个月的兔子数量
        for (int i = 3; i <= n; i++) {
            rabbits[i] = rabbits[i - 1] + rabbits[i - 2]; // 斐波那契公式
        }

        // 输出每个月的兔子总数
        System.out.println("每个月的兔子总数为：");
        for (int i = 1; i <= n; i++) {
            System.out.println("第 " + i + " 个月: " + rabbits[i] + " 对兔子");
        }

        scanner.close();
    }
}
