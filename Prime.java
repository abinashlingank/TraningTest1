import java.util.Scanner;
public class Prime{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int e = sc.nextInt();
        boolean f = true;
        for(int i=2; i<=e/2; i++){
            if(e%i==0){
                f = false;
                break;
            }
        }
        if(f){
            System.out.println("The given number is prime");
        }else{
            System.out.println("The given number is not a prime");
        }
    }
}