import java.util.Arrays;
import java.util.Scanner;


public class Ques14_ArrayMinMaxSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入整数的个数：");
        int n = scanner.nextInt();

        // 创建数组来存放用户输入的整数
        int[] numbers = new int[n];

        // 输入数组元素
        System.out.println("请逐个输入 " + n + " 个整数：");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 找到最大值和最小值
        int max = Arrays.stream(numbers).max().orElse(0);
        int min = Arrays.stream(numbers).min().orElse(0);
        // 输出最大值和最小值
        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);

        // 排序数组
        Arrays.sort(numbers);

        // 输出排序后的数组
        System.out.println("从小到大排序后的数组：");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // 输出换行

        scanner.close();
    }
}
