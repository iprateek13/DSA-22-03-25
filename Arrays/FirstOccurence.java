import java.util.*;

public class FirstOccurence {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 5, 8 };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
            System.out.println(ans + " "); //-->catch
            // System.out.println("function continues......");
        }
        System.out.println(ans + " ");
    }

}
