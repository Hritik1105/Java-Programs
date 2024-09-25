import java.util.Scanner;

public class evenoddarr {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
        int arr[]=new int[15];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the element size");
            int n=sc.nextInt();
            System.out.println("Enter the elements one by one");
            for(int i=0;i<n;i++)
            {   try (Scanner sr = new Scanner(System.in)) {
                arr[i]=sr.nextInt();
            }
            
            }
            System.out.print("The entered array is:- ");
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println("");
            for(int i=0;i<n;i++)
            {
                if (arr[i]%2==0)
                {
                    even=even+1;
                }
                else
                {
                    odd=odd+1;
                }
            }
            System.out.println("Total even number in array is : "+even);
            System.out.println("Total odd number in array is : "+odd);
        }
        
    }
    
}
