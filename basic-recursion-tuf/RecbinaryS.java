import java.util.ArrayList;
import java.util.Scanner;

public class RecbinaryS {
    public static int isbinary(ArrayList<Integer> arr, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) < target) {
                return isbinary(arr, target, mid + 1, end);
            } else {
                return isbinary(arr, target, start, mid - 1);
            }
        }
        return -1;
    }

    public static int isbinarySearch(ArrayList<Integer> arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr.get(mid) == target) {
            return mid;
        } else if (arr.get(mid) < target) {
            return isbinarySearch(arr, target, mid + 1, end);
        } else {
            return isbinarySearch(arr, target, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(3);
        ls.add(4);
        ls.add(8);
        ls.add(9);
        ls.add(10);
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = isbinary(ls, target, 0, ls.size() - 1);
        System.out.println("index is : " + index);
        sc.close();
    }
}
