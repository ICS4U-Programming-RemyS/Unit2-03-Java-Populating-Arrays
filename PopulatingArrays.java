import java.util.Arrays;

/**.
* This program will generate 50 random integers
* between 1 and 100 on 5 different lines
* and then sort the integers from lowest to highest as well as the average
*
* @author Remy Skelton
* @version 1.0
* @since 2025-03-18
*/

final class PopulatingArrays {

    /**
     * MAX_ARRAY size variable.
     */
    public static final int MAX_ARRAY = 10;

    /**
     * LINES variable.
     */
    public static final int LINES = 5;

    /**
     * MAX_VALUE variable.
     */
    public static final int MAX_VALUE = 100;

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private PopulatingArrays() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) throws Exception {
        // FOR loop to create 5 line of random integers
        for (int line = 0; line < LINES; line++) {
            // initialize the array of random integers
            int[] arrayRandInts = new int[MAX_ARRAY];

            // Call the populatingArrays method
            arrayRandInts = populatingArrays();

            // initialize the sum variable
            int sum = 0;

            // Sort the array of random integers
            Arrays.sort(arrayRandInts);

            // FOR loop to find sum of all integers
            for (int index = 0; index < MAX_ARRAY; index++) {
                sum += arrayRandInts[index];
            }
            // Calculate the average
            double average = (double) sum / MAX_ARRAY;

            // Print the sorted array of random integers
            for (int index = 0; index < MAX_ARRAY; index++) {
                System.out.print(arrayRandInts[index] + " ");
            }

            // Print the average
            System.out.println("Average: " + average);
        }
    }

    public static int[] populatingArrays() {
        // initialize the array of random integers
        int[] arrayRandInts = new int[MAX_ARRAY];

        // For loop to add random integers to the array
        for (int index = 0; index < MAX_ARRAY; index++) {
            arrayRandInts[index] = (int) (Math.random() * MAX_VALUE) + 1;
        }
        // Return the array of random integers
        return arrayRandInts;
    }
}
