package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Write code that concatenates the input parameters and returns the result
        // throw new RuntimeException("Not implemented");
        String concatenatedString = word1.concat(word2).concat(word3);
        // System.out.println(word1.concat(word2).concat(word3));
        return(concatenatedString);

    }

    public static Boolean areEqual(String word1, String word2) {
        // Write code to determine whether the input parameters are equal strings
        // throw new RuntimeException("Not implemented");
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
// <<<<<<< HEAD
//         // Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
//         // throw new RuntimeException("Not implemented");
//         String formattedString = String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
//         // You should use %s for strings, %d for integers, and %.2f for doubles (two decimal places for the price).
//         return formattedString; 
//         // return "Item: [item]. Price: £[amount]. Quantity: [quantity]"
// =======
//         // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[price]. Quantity: [quantity]". The price should be formatted to two decimal places, e.g. 99.99
//         throw new RuntimeException("Not implemented");
// >>>>>>> aa9a8f7a9cdd6151bae5bb9bf1ca8923b5ba87de
//     }
}
