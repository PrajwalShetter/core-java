public class SecondLargest {
    public static void main(String[] args) {

        int arr[]={12,44,2,90,65};

        int largest=0;
        int second=0;

        for(int n:arr){

            if(n>largest){
                second=largest;
                largest=n;
            }
            else if(n>second){
                second=n;
            }
        }

        System.out.println(second);
    }
}