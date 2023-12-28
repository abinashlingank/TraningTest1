import java.util.Scanner;
public class Odd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        for(int i = 0; i<n; i+=2){
            System.out.print(i+1);
            System.out.print(" ");
            System.out.println();
        }
    }
}