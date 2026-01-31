import java.util.Scanner;
class max
{
    public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
     int[] a = new int[5];
    System.out.println("enter array values");

     for(int i=0;i<5;i++)
     {
        a[i]=sc.nextInt();
     }
     int max = a[0];
     for(int i=0;i<5;i++)
     {
     if(a[i]>max)
     {
        max = a[i];
     }
     }
     System.out.println("Maximun value : "+max);
    }
}