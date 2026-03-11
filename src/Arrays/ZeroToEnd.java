package Arrays;

public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,2};
        int index=0;

        for (int i=0; i< arr.length; i++){
            if (arr[i] !=0){
                arr[index]=arr[i];
                index++;
            }
        }//{1,3,12,3,12}
while (index< arr.length){  // fill zeros at the end
    arr[index]=0;
    index++;
}
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
