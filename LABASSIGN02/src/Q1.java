import java.util.*;
//19105112 Kareena
public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the score:");
        float score = sc.nextFloat();

        if (score>=80 && score <=90){
            score+=5;
        }
        System.out.println("Score is "+ score);
        sc.close();


    }

    
}
