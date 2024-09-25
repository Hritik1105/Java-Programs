import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) 
    {
        int arm=0;
        int num;
        int digit;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
             num=sc.nextInt();
        }
        int temp=num;
         while(num>0){
            digit=num%10;
           arm=arm+digit*digit*digit;
           num=num/10;
        }
        System.out.print("The armstong of "+temp);
        System.out.println(" is "+arm);
    if(temp==arm)
    {
        System.out.println("Number is armstrong");
    }
    else{
        System.out.println("Number is not armstrong");
    }
    }
    
}
