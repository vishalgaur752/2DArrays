public class SearchInSortedMatrix {
    public static boolean searchKey(int matrix[][], int key) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("key found at : (" + i + ", "+j + ")" );
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 48;
        System.out.println(searchKey(matrix, key));
    }
}
