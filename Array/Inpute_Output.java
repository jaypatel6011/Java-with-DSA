/**
 * Inpute_Output
 */
import java.util.Scanner;
public class Inpute_Output {

    public static void main(String[] args) {
        System.out.println("Enter Array length");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array items");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //print array
        System.out.println("Print Array");

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

    }
}