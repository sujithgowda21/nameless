package Arrays;

public class MissingEle {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5;

        int result=n*(n+1)/2;
        int actualsum=0;

        for (int i=0; i<arr.length; i++){
            actualsum +=arr[i];
        }
        int missing=result-actualsum;
        System.out.println(" Missing element is "+ missing);
    }
}
