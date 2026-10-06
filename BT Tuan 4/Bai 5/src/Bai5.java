import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {
    public static void printArray(List<Integer> arr){
        for (int i = 0;i < arr.size();i++){
            System.out.print(arr.get(i) + (i == arr.size() - 1 ? "" : " "));
        }
        System.out.println();
    }
    public static void insertionSort2(int n, List<Integer> arr){
        for (int i = 1; i < n; i++){
            int j = i - 1;
            int temp = arr.get(i);
            while (j >= 0 && arr.get(j) > temp){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,temp);
            printArray(arr);
        }
    }
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int q = sc.nextInt();
            for (int i = 0; i < q; i++){
                a.add(i, sc.nextInt());


            }
            insertionSort2(q,a);
        }
    }
}
