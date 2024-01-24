import java.util.*;
    public class fib {
        int fib(int n)
            {
                if(n==0)
                {
                    return 0;
                }
                else if(n==1)
                {
                    return 1;
                }
                else
                {
                    return fib(n-1) + fib(n-2);
                }
            }
        public static void main(String args[])
        {
            
            fib f =new fib();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            for(int i =0;i<n;i++)
            {
                System.out.println(f.fib(i));
            }
        } 
    }
    


