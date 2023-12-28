import java.util.Scanner;
public class Leap{
    public static void main(String[]args){
    System.out.print("Enter the year:");
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if((y%4==0 || y%100==0) || y%400==0){
        System.out.println(y + " is a leap year");
    }else{
        System.out.println(y + " is not a leap year");
    }}

}