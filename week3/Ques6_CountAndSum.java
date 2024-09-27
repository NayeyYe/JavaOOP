public class Ques6_CountAndSum
{
    public static void main(String[] args)
    {
        int count=0;
        int sum=0;
        for(int i=7; i<=100; i+=7)
        {
            count++;
            sum+=i;
        }
        System.out.println("1-100中7个倍数的整数的个数为"+count);
        System.out.println("1-100中7个倍数的整数的总和为"+sum);
    }
}
