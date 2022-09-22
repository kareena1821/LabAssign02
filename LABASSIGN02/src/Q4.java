public class Q4 {
    public static void main(String[] args) {
        double population = 80000;
        int years=0;
        while(population <=150000){
            years++;
            population=population*1.05;// Adding 5% of current population to previous value
           // System.out.println(population);
        }
        System.out.println("Time taken for Population to exceed 150000: " + years+ " years");
    }
    
}
