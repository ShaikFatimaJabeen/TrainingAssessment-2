import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class SortingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
        sc.close();
    }
}