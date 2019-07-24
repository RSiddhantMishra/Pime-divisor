import java.io.*;
import java.util.*;
class primedivisor
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n/2];
        int k=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                int b=i+(n/i);
                for(int j=1;j<=b/2;j++)
                {
                    if(b%j==0)
                    {
                        a[k++]=i;
                    }
                }
            }
        }
        for(int l=0;l<k;l++)
        {
            System.out.println(a[l]);
        }
    }
}
