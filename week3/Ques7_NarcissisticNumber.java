public class Ques7_NarcissisticNumber
{
    public static void main(String[] args)
    {
        System.out.println("水仙花数有:");

        // 遍历所有三位数
        for (int i = 100; i < 1000; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;


            int sumOfCubes =
                    (hundreds * hundreds * hundreds) +
                    (tens * tens * tens) +
                    (units * units * units);


            if (sumOfCubes == i) {
                System.out.println(i);
            }
        }
    }
}
