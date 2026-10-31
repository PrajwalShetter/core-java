public class EvenOdd {
    public static void main(String[] args) {

        int arr[]={10,21,34,45,50};
        int even=0, odd=0;

        for(int n:arr){
            if(n%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("Even="+even);
        System.out.println("Odd="+odd);
    }
}