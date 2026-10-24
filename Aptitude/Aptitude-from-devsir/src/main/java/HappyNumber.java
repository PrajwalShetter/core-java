import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {

        int num=19;

        Set<Integer> set = new HashSet<>();

        while(num!=0 && !set.contains(num)){

            set.add(num);
            int sum =0;

            while(num>0){
                int digit = num%10;
                sum += digit * digit;
                num= num/10;
            }

            num = sum;
        }

        if(num == 1){
            System.out.println("Happy number");
        }else {
            System.out.println("Not Happy number");
        }
    }
}
