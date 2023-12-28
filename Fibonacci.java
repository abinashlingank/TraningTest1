import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
        System.out.println("Invalid input");
        }else{
            for(int i=0; i<n; i++){
                System.out.print(fibo(i)+" ");
            }
        }
    }
    public static int fibo(int i){
        if(i==0 || i== 1){
            return 1;
        }else{
            return fibo(i-1) + fibo(i-2);
        }
    }
}