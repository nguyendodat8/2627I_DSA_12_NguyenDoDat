import java.io.*;
import java.util.Stack;

public class Bai_2 {
    public static String isBalanced(String in){
        Stack<Character> s = new Stack<>();
        for (char c: in.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                s.push(c);

            } else if (c == ')' || c == '}' || c == ']'){
                if (s.isEmpty()){
                    return "NO";
                }
                char b = s.pop();
                if (c == ')' && b != '('){
                    return "NO";
                } else if (c == '}' && b != '{'){
                    return "NO";
                } else if (c == ']' && b != '['){
                    return "NO";
                }

            }
        }
        return s.isEmpty() ? "YES" : "NO";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = 0;
        try {
            t = Integer.parseInt(bufferedReader.readLine().trim());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < t; i++) {
            String s = bufferedReader.readLine();
            String result = Bai_2.isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
