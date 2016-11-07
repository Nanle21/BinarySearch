package binarysearch;
import java.util.Scanner;

public class linearSearch  {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int i, n, search, num[];
        
        System.out.println("Entwe number of elements");
        n = in.nextInt();
        num =new int[n];
        
        System.out.println("Enter" + n + "integers");
        for(i = 0; i < n; i++ ){
            num[i] = in.nextInt();
        }
        System.out.println("Enter value to find");
        search = in.nextInt();
        
        for(i = 0; i < n; i++){
            if(num[i] == search){
                System.out.println(search + "is present at location" + (i + 1) + ".");
                break;
            }
            if(i == n){
                System.out.println(search + "is not present in array");
            }
        }
    }
}
