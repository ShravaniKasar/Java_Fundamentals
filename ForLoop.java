
import java.util.Scanner;



public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();


        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hello World");
            System.out.println(i);
            System.out.println(78);
        }

        int sum= 0 ;
        for(int i=0 ; i<=n ; i++)
        {
            sum =sum + 2*i;
            System.out.println(sum);
        }
    }

}
