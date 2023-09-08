import java.util.Scanner;
public class CalciMethod{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition\n2.Subtraction\n3.MUlti\n5.Division");
        System.out.println("Enter the choice:");
        char op=sc.next().charAt(0);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        switch (op) {
            case '+':
                add(a,b);
                break;
            case '-':
                sub(a,b);
                break;
            case '*':
                mul(a,b);
                break;
            case '/':
                div(a,b);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        
    }

    
 
    public static void add(int a, int b)
    {
        System.out.println(a+b);
        
    }
    public static void sub(int a, int b)
    {
        System.out.println(a-b);
        
    }

    
    public static void mul(int a, int b)
    {
        System.out.println(a*b);
        
    }
    public static void div(int a, int b)
    {
        System.out.println(a/b);
        
    }
}