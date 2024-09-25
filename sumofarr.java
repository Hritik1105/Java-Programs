import java.util.Scanner;  
public class sumofarr
{  
public static void main(String[] args)   
{  
int n;
int target;  
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter the number of elements you want to store: ");  
    n=sc.nextInt();
    System.out.print("Enter the target element: ");
    target=sc.nextInt();

    
       
    int[] array = new int[10];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++)  
    {     
    array[i]=sc.nextInt();  
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(array[i]+array[j]==target)
            {
                System.out.println("First Value  = "+array[i]+"     Index Value = "+i);
                System.out.println("Second Value = "+array[j]+"     Index Value = "+j);
            }
        }
    }
}  

}  
}  
