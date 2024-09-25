import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        int temp;
        int temp1=0;
        System.out.print("Please Enter The First Number :- ");
        try (Scanner sc = new Scanner(System.in)) {
            int num1=sc.nextInt();

            System.out.print("Please Enter The Second Number :- ");
            try (Scanner st = new Scanner(System.in)) {
                int num2=st.nextInt();
                if(num1<num2)
                {
                    temp=num2;
                }
                else
                {
                    temp=num1;
                }
                for(int i=1;i<=temp;i++)
                {
                    if(num1%i==0 && num2%i==0)
                    {
                        temp1=i;
                    }
                }
                System.out.println("Greatest Common Divisor of "+num1+" and "+num2+" is "+temp1);
            }
        }
    }
    
}
