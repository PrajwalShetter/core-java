public class MissingNumber {
    public static void main(String[] args) {

        int[] arr ={3,0,2,4,8,9,6,5,7};

        int n = arr.length;
        int result = n;

        for(int i =0;i<arr.length;i++){
            result = result^i^arr[i];
        }
        System.out.println("missing number :"+result);
    }

}
