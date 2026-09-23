import java.util.Arrays;

public class FourSum {
    private FourSum() {
    }

    private static boolean isDuplicate(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) return true;
        }
        return false;
    }

    public static void return_result(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (isDuplicate(a)) throw new IllegalArgumentException("Duplicate number");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int m = Arrays.binarySearch(a, -(a[i] + a[j] + a[k]));
                    if (m > k) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k] + " " + a[m]);
                    }
                }
            }

        }

    }

    public static int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (isDuplicate(a)) throw new IllegalArgumentException("Duplicate number");
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int m = Arrays.binarySearch(a, -(a[i] + a[j] + a[k]));
                    if (m > k) count++;
                }

            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] test1Unique = {-2, -1, 1, 2, 4, -3};
        FourSum.return_result(test1Unique);
        try {
            int[] testDuplicate = {1, 2, 2, -3};
            FourSum.return_result(testDuplicate);
        } catch (IllegalArgumentException e) {
            System.out.println("Bat duoc loi ngoai le thanh cong: " + e.getMessage());
        }
    }
}
