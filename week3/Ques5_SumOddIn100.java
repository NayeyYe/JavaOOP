public class Ques5_SumOddIn100
{
    public static void  main(String[] args)
    {
        int num = 0;
        for(int i=1; i<=99; i+=2)
        {
            num+=i;
        }
        System.out.println("1-100中所有奇数的和为"+num);
    }
}
