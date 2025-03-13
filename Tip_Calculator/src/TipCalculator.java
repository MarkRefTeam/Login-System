public class TipCalculator {

    /**This method calculates the tip based on a given percentage.
    //If the percentage is between 10 and 80, it returns the calculated tip amount.
    //If the percentage is invalid, it returns -1.
     */

    public static void main(String[] args) {

        /**
         * The main entry point of the program where we test the method with different cases.
         * example array containing the prices of purchased items
         */


        int[] prices = {2000, 250, 300, 50, 250};

        //Testing the calculateTip method with different percentage values.

        System.out.println(calculateTip(prices, 20));     //Expected output: 570 (valid)
        System.out.println(calculateTip(prices, 5));      //Expected outpost: -1 (too low)
        System.out.println(calculateTip(prices, 90));     //Expected outpost: -1 (tpp high)


    }

    public static int calculateTip(int[] prices, int percentage) {

        //Validate if the percentage is within the acceptable range (10-80)

        if (percentage < 10 || percentage > 80) {
            return -1;     // Return -1 for invalid percentages
        }

        //Calculate the bill amount using the sumPrices method
        int total = sumPrices(prices);

        //Calculate the tip: total amount * percentage / 100
        return (total * percentage) / 100;

    }
    public static int sumPrices(int[] prices) {
        int sum = 0;                                            //Initialize sum to zero
        for (int price : prices) {                              //Iterate through all elements in the array
            sum += price;                                       //Add each price to the total sum
        }
        return sum;                                             //Return the final total amount
    }
}





