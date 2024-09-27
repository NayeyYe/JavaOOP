// 基本思路：变成字符串切割存储
public class Ques10_ExtractDigits
{
    public static void main(String[] args) {
        int n = 1678;
        // 创建可变字符串
        // 注意：没有用String，用的是StringBuilder
        StringBuilder result = new StringBuilder();

        // 使用 while 循环提取每位数字，直到 n 为 0
        while (n > 0) {
            // 获取当前最低位的数字
            int digit = n % 10;
            // 在结果前面插入新提取的数字
            result.insert(0, digit + ", ");
            // 去掉已提取的最低位
            n = n / 10;
        }

        // 删除最后一个多余的逗号和空格
        if (!result.isEmpty()) {
            result.setLength(result.length() - 2);
        }


        System.out.println("n = " + result);
    }
}
