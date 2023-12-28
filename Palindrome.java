import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";

        for(int i=s.length(); i>0; i--){
            r += s.charAt(i-1);
        }
        if(s.equalsIgnoreCase(r)){
            System.out.println(s+" is a Palindrome");
        }else{
            System.out.println(s+ " is not a palindrome");
        }
    }
}