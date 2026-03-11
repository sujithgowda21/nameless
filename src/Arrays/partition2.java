package Arrays;

public class partition2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1, 6};
        int even = 0;
        int odd = arr.length - 1;
        while (even < odd) {
            while (arr[even] % 2 == 0 && even < odd) {
                even++;
            }
            while (arr[odd] % 2 != 0 && even < odd) {
                odd--;
            }
            if (even < odd) {
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
                even++;
                odd--;
            }
            }
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");


        }
    }
}


