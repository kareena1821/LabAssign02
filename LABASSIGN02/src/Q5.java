import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("n  n^2  n^3  n^4");
        for (int i=1;i<=n;i++){
            int first_power= i;
            long  second_power= i*i;
            long third_power=i*second_power;
            long forth_power=i*third_power;
            System.out.println(first_power+"   "+second_power+"   "+third_power+"   "+forth_power);
        }


    }
    
}
