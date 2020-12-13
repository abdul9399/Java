import java.util.*;
class Hello
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter a string:");
        String s=in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' '){
                int c=(int)s.charAt(i)-32;
                System.out.print((char)c);
            }
        }
        in.close();
    }
}