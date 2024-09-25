
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int a;
        int fact=1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num=sc.nextInt();
            if(num>0){
                for(a=num;a>0;a--)
                {
                    fact=fact*a;
                }
            }
            else{
                System.out.print("Factorial of 0 is 1");
            }
            System.out.print("Factorial of "+num);
            System.out.print(" is "+fact);
        }
        }
        
}