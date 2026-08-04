public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6};

        int n = 6;

        int sum = n * (n + 1) / 2;

        int actual = 0;

        for(int num : arr){
            actual += num;
        }

        System.out.println("Missing Number = " + (sum - actual));
    }
}