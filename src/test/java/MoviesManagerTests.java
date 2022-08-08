import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoviesManagerTests {


    @Test
    public void limitLessThanLength() {
        MoviesManager manager = new MoviesManager(5);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");
        manager.addMovie("movie11");
        manager.addMovie("movie12");
        manager.addMovie("movie13");
        manager.addMovie("movie14");
        manager.addMovie("movie15");

        String[] actual = manager.findLast();
        String[] expected = { "movie15", "movie14", "movie13", "movie12", "movie11"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void limitIsTheLength() {
        MoviesManager manager = new MoviesManager(5);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        String[] actual = manager.findLast();
        String[] expected = { "movie5", "movie4", "movie3", "movie2", "movie1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void limitGreaterThanLength() {
        MoviesManager manager = new MoviesManager(6);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        String[] actual = manager.findLast();
        String[] expected = { "movie5", "movie4", "movie3", "movie2", "movie1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void defaultLimit() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");
        manager.addMovie("movie11");
        manager.addMovie("movie12");
        manager.addMovie("movie13");
        manager.addMovie("movie14");
        manager.addMovie("movie15");

        String[] actual = manager.findLast();
        String[] expected = { "movie15", "movie14", "movie13", "movie12", "movie11", "movie10", "movie9", "movie8", "movie7", "movie6"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void LengthIsTheDefaultLimit() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");
        String[] actual = manager.findAll();
        String[] expected = { "movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void LengthLessThanDefaultLimit() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        String[] actual = manager.findAll();
        String[] expected = { "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};

        assertArrayEquals(expected, actual);
    }

}
