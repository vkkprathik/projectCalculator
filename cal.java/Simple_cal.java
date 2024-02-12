import java.util.Scanner;
class cal
{
    public float add(int a, int b)
    {
        return a + b;
    }
    public float sub(int a, int b)
    {
        return a - b;
    }
    public float mul(int a, int b)
    {
        return a * b;
    }
    public float div(int a, int b)
    {
        return a / b;
    }
}
class Simple_cal
{
    public static void main(String args[])
    {
        cal c = new cal();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int exp=3;//sc.nextInt();
       switch(exp)
        {
            case 1:System.out.println("add of two number="+c.add(10,20));
            break;
            case 2:System.out.println("sub of two number="+c.sub(20,10));
            break;
            case 3:System.out.println("mult of two number="+c.mul(10,20));
            break;
            case 4:System.out.println("div of two number="+c.div(10,20));
        }

    }
}
