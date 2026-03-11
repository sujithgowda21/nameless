package Arrays;

public class maximum {
    public static void main(String[] args) {
        int[] arr={1,21,3,9,5};
        int maxi=0,  min=100;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>maxi){
                maxi=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Maximum Value is: "+maxi);
        System.out.println("Minimum Value is: "+min);
    }
}
