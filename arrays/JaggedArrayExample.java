package arrays;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a jagged array
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Access and print jagged array elements
        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
