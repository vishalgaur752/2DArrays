public class AssigmentQues3 {
    public static void printMatrix(int nums[][]) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 2, col = 3;
        int nums[][] = { { 2, 3, 7 }, { 5, 6, 7 } };
        printMatrix(nums);
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = nums[i][j];
            }
        }
        printMatrix(transpose);
    }
}
