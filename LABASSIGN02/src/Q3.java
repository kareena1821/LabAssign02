import java.util.*;
//Kareena 19105112
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the index of Month example 1 for January :");

        int index= sc.nextInt();
        switch(index){
            case 1:{
                System.out.println("January: 31 Days");
                break;
            }
            case 2:{
                System.out.println("February : 28 Days but if a leap year 29 Days");
                break;
            }
            case 3:{
                System.out.println("March : 31 Days");
                break;
            }
            case 4:{
                System.out.println("April 30 Days");
                break;
            }
            case 5:{
                System.out.println("May 31 Days");
                break;
            }
            case 6:{
                System.out.println("June 30 Days");
                break;

            }
            case 7:{
                System.out.println("July 31 Days");
                break;
            }
            case 8:{
                System.out.println("August 31 Days");
                break;
            }
            case 9:{
                System.out.println("September 30 Days");
                break;
            }
            case 10:{
                System.out.println("October 31 Days");
                break;
            }
            case 11:{
                System.out.println("November 30 Days");
                break;
            }
            case 12:{
                System.out.println("December 31 Days");
                break;
            }
            default:{
                System.out.println("Enter correct value");
                break;
            }

        }
        sc.close();
    }
    
}
