public class diamond {
    public static void main(String[] args) 
    {   int i,j,k;
        for( i=0;i<6;i++)
        {
            for( j=6-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                System.err.print("* ");
            }
            System.err.println("");
        }
        for(i=0;i<6;i++)
        {
            for(k=0;k<=i;k++ )
            {
                System.out.print(" ");
            }
            for(j=6-i;j>1;j--)
            {
                System.err.print("* ");
            }
            System.err.println("");
        }
            
            
            
        }
        
    }
    

