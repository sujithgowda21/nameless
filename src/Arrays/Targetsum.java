package Arrays;

public class Targetsum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 1};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(" the pair is " + arr[i] + " " + arr[j]);
                    System.out.println(" indexes are " + i + " " + j);
                }

            }

        }
    }
}


