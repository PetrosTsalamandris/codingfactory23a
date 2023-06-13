package gr.aueb.cf.ch6;

/**
 * πινακες που εχουν διαφορετικο μεγεθος
 * jagged arrays are arrays with (potentialy)
 * different dimension in each row.
 */
public class JaggedArray {

    public static void main(String[] args) {
        int[][] jaggedArr = new int[3][];

        jaggedArr[0] = new int[4];
        jaggedArr[1] = new int[3];
        jaggedArr[2] = new int[6];
    }
}
