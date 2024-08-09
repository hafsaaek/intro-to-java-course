package com.cbfacademy;

public class PlayerFactory {
    /**
     * Creates a new player.
     *
     * @return A new player.
     */
    public static Player create() { // return type is Player frmo the player interface
        return new DicePlayer();
        // The factory method correctly returns an interface type (Player) and creates a concrete class (DicePlayer) that implements this interface. This change promotes flexibility, maintainability, and adherence to good design principles by focusing on abstractions rather than concrete implementations
    }
}

