import java.util.Scanner;
class biggest_of_three_num
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers num1, num2, num3");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println("num1 = "+num1+" is greater");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("num2 = "+num2+" is greater");
        }
        else
        {
            System.out.println("num3 = "+num3+" is greater");
        }
    }
}
