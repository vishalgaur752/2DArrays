import java.util.*;

public class Matrix {
    public static boolean search(int nums[][], int key) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] == key) {
                    System.out.println("Key found at cel (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean larNsmall(int nums[][]) {
        int largeNum = Integer.MIN_VALUE;
        int smallNum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] > largeNum) {
                    largeNum = nums[i][j];
                }
                if (nums[i][j] < smallNum) {
                    smallNum = nums[i][j];
                }
            }
        }
        System.out.println("largest number in matrix : " + largeNum);
        System.out.println("smallest number in matrix : " + smallNum);
        return false;
    }

    public static void main(String[] args) {
        int nums[][] = new int[3][3];
        int n = nums.length, m = nums[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        search(nums, 5);
        larNsmall(nums);
    }
}