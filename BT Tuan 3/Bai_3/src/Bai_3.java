import java.util.Scanner;
import java.util.Stack;

public class Bai_3 {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    static void enqueue(int n){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(n);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }
    static void dequeue(){
        if (s1.isEmpty()){
            return;
        }
        s1.pop();
    }
    static int print(){
        if (!s1.isEmpty()){
            return s1.peek();
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int q = sc.nextInt();
            for (int i = 0; i < q;i++){
                int type = sc.nextInt();
                if (type == 1){
                    int x  = sc.nextInt();
                    enqueue(x);
                } else if (type == 2){
                    dequeue();
                } else if (type == 3){
                    System.out.println(print());
                }
            }

        }

    }


}
