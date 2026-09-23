public class ClosestPair {
    private ClosestPair(){}
    public static void findClosestPair(double[] a){
        if (a == null || a.length < 2){
            System.out.println("Mảng có ít nhất 2 phần tử");
            return;
        }

        double minDiff = Math.abs(a[1] - a[0]);
        double num1 = a[0];
        double num2 = a[1];
        for (int i = 1; i < a.length - 1;i++){
            double currentDiff = Math.abs(a[i+1] - a[i]);
            if (currentDiff < minDiff){
                num1 = a[i];
                num2 = a[i+1];
            }
        }
        System.out.println("Cặp số gần nhất là: (" + num1 + ", " + num2 + ")");
        System.out.println("Hiệu tuyệt đối nhỏ nhất: " + minDiff);




    }
    private static void mergeSort(double[] a, int left, int right){
        if (left < right){
            int mid = left + (right - left) / 2;
            mergeSort(a,left,mid);
            mergeSort(a, mid + 1,right - 1);
            merge(a,left,mid,right);
        }

    }
    private static void merge(double[]a, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        double[] L = new double[n1];
        double[] R = new double[n2];
        for (int i = 0; i < n1; i++){
            L[i] = a[left + i];

        }
        for (int j = 0; j < n2; j++){
            R[j] = a[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args){
        double[] a = {-10.5,3.2,5.3,4.5,-7.3,2.8};
        findClosestPair(a);
    }


}
