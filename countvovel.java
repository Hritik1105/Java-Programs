
import java.util.Scanner;

public class countvovel {
    public static void main(String[] args) {
        int vovel=0;
        int cons=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the string : ");
        String str=sc.next();
        int num=str.length();
        for(int i=0;i<num;i++)
        {
            char ch=str.charAt(i);
            if (ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch == 'A'||ch =='E'||ch =='I'||ch =='O'||ch =='U') {
                System.out.println(ch+" is vowel");
                vovel++;
            }
            else
            {
                System.out.println(ch+" is consonant");
                cons++;
            }

            
        }
        System.out.println("Total no of vowel: "+vovel);
        System.out.println("Total of consonant: "+cons);
        sc.close();
        }
    }
    

