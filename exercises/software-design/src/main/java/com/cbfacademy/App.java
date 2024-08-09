package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        Player player1 = PlayerFactory.create(); // Create first player
        Player player2 = PlayerFactory.create(); // Create second player

        // Pass players to DiceGame constructor
        DiceGame game = new DiceGame(player1, player2);

        // Play the game and get the result
        String winner = game.play();

        // Print the winner
        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
}
