package test;

import com.company.BoardGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardGameTest {

    @Test
    public void should_throw_exception_because_of_wrong_price() {
        try {
            new BoardGame(-5,2,6,"Carcassone", 8);
            fail("Exception wasn't thrown!");
        } catch (IllegalArgumentException exception) {
            assertEquals("price can't be lower than 0$", exception.getMessage());
        }
    }

    @Test
    public void should_throw_exception_because_of_wrong_score() {
        try {
            new BoardGame(10,2,6,"Carcassone", 11);
            fail("Exception wasn't thrown!");
        } catch (IllegalArgumentException exception) {
            assertEquals("score must be in range <0,10>", exception.getMessage());
        }
    }

    @Test
    public void should_throw_exception_because_of_wrong_number_of_players() {
        try {
            new BoardGame(10,8,6,"Carcassone", 8);
            fail("Exception wasn't thrown!");
        } catch (IllegalArgumentException exception) {
            assertEquals("min number of players can't be greater than max", exception.getMessage());
        }
    }

    @Test
    public void should_throw_exception_because_of_wrong_min_number_of_players() {
        try {
            new BoardGame(10,-8,6,"Carcassone", 8);
            fail("Exception wasn't thrown!");
        } catch (IllegalArgumentException exception) {
            assertEquals("min number of players can't be lower than 0", exception.getMessage());
        }
    }


}