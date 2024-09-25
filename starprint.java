public class starprint{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.err.print("*");
            }
            System.err.println("");
        }
    }
}