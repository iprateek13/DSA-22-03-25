import java.util.Arrays;

public class BasicArray {
    public static void ArrayAddress(int arr[], double arr2[], char arr3[], boolean arr4[], String names[]) {
        System.out.println("------");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr + " int");
        System.out.println("------");
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2 + " double");
        System.out.println("------");
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3 + " char");
        System.out.println("------");
        System.out.println(Arrays.toString(arr4));
        System.out.println(arr4 + " boolean");
        System.out.println("------");
        System.out.println(Arrays.toString(names));
        System.out.println(names + " Strings ");
        System.out.println("------");
        System.out.println("__________");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        double[] arr2 = new double[5];
        char[] arr3 = new char[5];
        boolean[] arr4 = new boolean[5];
        String[] names = new String[3];
        ArrayAddress(arr, arr2, arr3, arr4, names);
    }
}
