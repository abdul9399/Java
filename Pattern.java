import java.util.Scanner;
public class Pattern 
{
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print the pattern");
        x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }    
}