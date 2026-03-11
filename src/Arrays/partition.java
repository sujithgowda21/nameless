package Arrays;

public class partition {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 7, 6};
        int[] result = new int[arr.length];
        int index = 0;

        // Store even numbers first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Store odd numbers next
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        // Print final array
        System.out.println("Partitioned Array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

