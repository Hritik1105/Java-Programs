
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Please Enter The Number");
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            for(int i=2;i<num;i++)
            { if(num%i==0)
                {
                count=count+1;
                break;
                }
                
            }
        }
        if(count==1)
        {
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        }
    
}
