
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter Array length");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array items");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //print array
        
        for(int i=0; i<size; i++){
           sum += arr[i];
        }
        
        System.out.println("Sum of Array: " +sum);
    }
}
