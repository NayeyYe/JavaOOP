import java.util.Scanner;

public class Ques12_PrimeNumbers
{
    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // 如果能被整除，则不是素数
            }
        }
        return true; // 否则是素数
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();

        if (n < 0)
        {
            System.out.println("输入错误！请输入一个正整数！");
            return;
        }


        if (n < 2) {
            System.out.println("没有素数在 " + n + " 之内。");
            return;
        }

        System.out.println("小于 " + n + " 的素数有：");
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
