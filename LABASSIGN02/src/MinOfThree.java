//Kareena 19105112
public class MinOfThree {
    public static void main(String[] args) throws Exception {
        
        int first=15;
        System.out.println("First Number: "+ first);
        int second=112;
        System.out.println("Second Number: "+ second);
        int third=113;
        System.out.println("Third Number: " + third);
        int mini=first;
        if (first<second){
            if (first<third){
              mini=first;  
            }
            else{
                mini=third;
            }
        }
        else{
            if (second<third){
            mini=second;  
          }
          else{
              mini=third;
          }


        }
        System.out.println("MinimumOfThree :"+mini);
    } 
}
