public class SpiralMatrix {
    public static void spiralMatrix(int arr[][]) {
        int strRow = 0;
        int strCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        while (strRow <= endRow && strCol <= endCol) {
            // top boundary
            for (int i = strCol; i <= endCol; i++) {
                System.out.print(arr[strRow][i] + " ");
            }

            // right boundary
            for (int j = strRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endCol] + " ");
            }

            // bottom boundary
            for (int i = endCol - 1; i >= strCol; i--) {
                if (strRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][i] + " ");
            }

            // left boundary
            for (int j = endRow - 1; j >= strRow + 1; j--) {
                if (strCol == endCol) {
                    break;
                }
                System.out.print(arr[j][strCol] + " ");
            }
            strCol++;
            strRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiralMatrix(arr);
    }
}
