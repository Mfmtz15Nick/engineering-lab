
public class Problem01 {

    public static void main(String[] args) {

        // Multiples of 3 or 5
        // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 4, 6 and 9. 
        // The sum of these multiples is 23.
        // Find the sum of all the multiples of 3 or 4 below 1000.
        // My notes
        // There're 2 important things
        // 1.- % Get the multiple of each number
        // 2.- I don't want to recorrer the list of number we'll use Gauss formula. nxn+1/2
        // I need to get a number series from 3 number 3, 5 and 15 that's the reason I need to create another method
        
        int response = getSum(3, 1000) + getSum(5, 1000) - getSum(15, 1000);

        System.out.println("Response: " + response);

    }

    // I need this method to calculate the sum with Gauss formula.
    // k -> multiple
    // limit -> limit of serie
    static private int getSum(int k, int limit) {
        int n = (limit - 1) / k;
        return k * (n * (n + 1) / 2);
    }
}
