package mission03;

public class Evaluation4 {
    public static void main(String[] args) {

        int[] arr = {4, 6, 2, 1};
        int sum=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0 && arr[i]>0){
                System.out.println(arr[i]);
                sum += arr[i];
            }else{
                break;
            }
        }
        System.out.println(sum);
    }
}
