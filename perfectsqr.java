
import java.util.Scanner;

public class perfectsqr {
    public static void main(String[] args) {
        int per=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the Number: ");
            int num=sc.nextInt();
            if(num>0)
            {
                per=(int)Math.sqrt(num);
            }
            if(per*per==num)
            {
                System.out.print(num+" is Perfect Square");
            }
            else
            {
                System.out.print(num+" is not Perfect Square");
                
            }
        }
        
    }
    
}
