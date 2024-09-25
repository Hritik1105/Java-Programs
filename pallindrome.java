
import java.util.*;

public class pallindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Please Enter a integer value: ");
           int num=sc.nextInt();
           int b=num;
           int reverse=0;
           while(num!=0){
           int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;}
            if(reverse==b){
               System.out.println("Number is pallindrome");
            }
            else{
               System.out.println("Not pallindrome");
            }
      }

    }
    
}
