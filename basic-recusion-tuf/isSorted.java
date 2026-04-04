import java.util.*;

public class isSorted {

    
    public static boolean isSorted(ArrayList<Integer> arr, int n) {
        // base case
        if (n == 0 || n == 1) {
            return true;
        }
        return arr.get(n - 1) >= arr.get(n - 2) && isSorted(arr, n - 1);
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(isSorted(arr, arr.size()));
    }
}
