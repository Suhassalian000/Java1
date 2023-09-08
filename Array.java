import java.util.Scanner;
import java.util.Arrays;

class Array{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
         int size=s.nextInt();
         int [] a=new int[size];
        System.out.println("Enter the elements of array");
        for (int i=0 ;i<a.length;i++) 
        {
            a[i]=s.nextInt();
        }
        System.out.println("Array elements are");
        System.out.println(Arrays.toString(a));
        for (int i=0 ;i<a.length;i++) 
        {
            System.out.println(a[i]+" ");
        }

        char[] chara=new char[size];
        
        System.out.println("Enter the char array");
        for(int i=0;i<chara.length;i++){
           chara[i]=s.next().charAt(0);
        }
        System.out.println("Array elements are");
        System.out.println(Arrays.toString(chara));
        for(int i=0;i<chara.length;i++)
        {
            System.out.println(chara[i]+" ");
        }

        
    }
}