public class LargestOfThreeNo {
    public static void main(String[] args) {

        int a=10,b=25,c=18;

        if(a>b && a>c)
            System.out.println(a);
        else if(b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}