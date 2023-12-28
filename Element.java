import java.util.Scanner;
public class Element{
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element index:");
        int j = sc.nextInt();
        System.out.println("The Element is " + a[j]);
    }
}
