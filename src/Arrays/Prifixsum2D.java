package Arrays;

public class Prifixsum2D {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] prefix=new int[arr1.length];

        prefix[0]=arr1[0];

        for (int i=1; i<arr1.length ; i++) {
            prefix[i] = prefix[i-1] + arr1[i];
        }

        for (int i=0; i<arr1.length; i++){
            System.out.print(prefix[i]+" ");
        }
//        prifix range with sum
        int L=1;
        int R=3;

        int sum;
        if(L==0) {
            sum = prefix[R];
        }
        else{
            sum=prefix[R]-prefix[L-1];
        }
        System.out.println(" sum of range from 1 to 3: "+ sum);
    }
}

