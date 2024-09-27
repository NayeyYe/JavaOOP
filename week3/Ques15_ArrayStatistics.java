import java.util.Arrays;
import java.util.Random;

public class Ques15_ArrayStatistics {
    public static void main(String[] args) {
        final int SIZE = 10; // 数组大小
        int[] numbers = new int[SIZE];
        Random random = new Random();

        // 赋予随机整数并输出数组元素
        System.out.println("数组元素为：");
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = random.nextInt(100); // 随机生成0到99之间的整数
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // 输出换行

        // 计算最大值、最小值、总和


        int max = Arrays.stream(numbers).max().orElse(0);
        int min = Arrays.stream(numbers).min().orElse(0);
        int sum = Arrays.stream(numbers).sum();

        // 计算平均值
        double average = (double) sum / SIZE;
        // 输出数组
        System.out.println(Arrays.toString(numbers));
        // 输出结果
        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);
        System.out.println("总和: " + sum);
        System.out.printf("平均值: %.2f%n", average); // 保留两位小数
    }
}
