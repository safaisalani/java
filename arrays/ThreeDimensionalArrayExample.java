package arrays;

public class ThreeDimensionalArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a three-dimensional array
        int[][][] threeDimArray = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        // Access and print three-dimensional array elements
        System.out.println("Three-Dimensional Array Elements:");
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    System.out.print(threeDimArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
