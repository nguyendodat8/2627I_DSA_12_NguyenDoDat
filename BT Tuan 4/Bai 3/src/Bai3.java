import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void printArray(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + (i == arr.size() - 1 ? "" : " "));
        }
        System.out.println();
    }
    public static void Insertionsort1(int n,List<Integer> arr){
        int target = arr.get(n-1);
        int i = n - 2;
        while (i > 0 && arr.get(i) > target){
            arr.set(i+1,arr.get(i));
            printArray(arr);
            i--;
        }
        arr.set(i+1,target);
        printArray(arr);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int q = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < q; i++){
                a.add(i, sc.nextInt());
            }
            Insertionsort1(q,a);
        }
        sc.close();

    }
}
