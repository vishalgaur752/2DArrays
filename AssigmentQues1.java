public class AssigmentQues1 {
    public static int printCount(int array[][]) {
        int count = 0;
        for(int i = 0; i<array.length; i++) {
            for(int j = 0; j<array[0].length; j++) {
                if(array[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(printCount(array));

    }
}
