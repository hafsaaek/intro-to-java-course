package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        SimpleContainer container = initialiseContainer();

        Player player1 = container.get(Player.class); // Create first player
        Player player2 = container.get(Player.class); // Create second player

        // Pass players to DiceGame constructor
        Game game = container.get(Game.class);

        // Play the game and get the result
        String winner = game.play();

        // Print the winner
        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
        initialiseContainer();
    }

    private static SimpleContainer initialiseContainer() {
        SimpleContainer container = new SimpleContainer();

        // Register mappings for any required interfaces with their concrete implementations
        // container.register(Teacher.class, MathTeacher.class); // Tell the container that Teacher should be MathTeacher.
        container.register(Game.class, DiceGame.class);
        container.register(Player.class, DicePlayer.class);
        return container;
    }
}
