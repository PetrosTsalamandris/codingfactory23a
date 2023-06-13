package gr.aueb.cf.ch6;

/**
 * δηλωση, αρχικοποιηση πινακα και
 * populate = εισαγωγη στοιχειων
 */
public class PopulateArray {

    public static void main(String[] args) {

        //δηλωση και αρχικοποιηση πινακα με lenght (3)
        int[] arr = new int[3];
        arr[0] = 5;  //στη θεση 1 στοιχειο του πινακα
        arr[1] = 7;  // 8εση 2
        arr[2] = 8;  // θεση 3

        //System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //enhanced for
        for (int item : arr) {
            System.out.print(item + " ");
        }

        //Unisized Initialization δευτερος τροπος να αρχικοποιησουμε τον πινακα
        int[] arr2 = {1, 5, 8, 9, 12};

        // Array Initializer
        int[] arr3;
        arr3 = new int[] {4, 6, 9, 10};
    }
}
