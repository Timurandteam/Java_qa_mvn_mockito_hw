package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class MoviesPosterManagerTest {

    @Test
    public void shouldFindAllMovies() {
        MoviesPosterManager manager = new MoviesPosterManager();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void shouldAddMovieName() {
        MoviesPosterManager manager = new MoviesPosterManager();
        manager.add("MovieNameI");
        String[] expected = {"MovieNameI"};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void shouldAddFourMovieName() {
        MoviesPosterManager manager = new MoviesPosterManager();
        manager.add("MovieNameI");
        manager.add("MovieNameII");
        manager.add("MovieNameIII");
        manager.add("MovieNameIV");
        String[] expected = {"MovieNameI", "MovieNameII", "MovieNameIII", "MovieNameIV"};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void shouldReverseName() {
        MoviesPosterManager manager = new MoviesPosterManager();
        manager.add("MovieNameI");
        manager.add("MovieNameII");
        manager.add("MovieNameIII");
        manager.add("MovieNameIV");
        manager.add("MovieNameV");
        String[] expected = {"MovieNameV", "MovieNameIV", "MovieNameIII", "MovieNameII", "MovieNameI"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReverseNameLowerLimit() {
        MoviesPosterManager manager = new MoviesPosterManager(3);
        manager.add("MovieNameI");
        manager.add("MovieNameII");
        manager.add("MovieNameIII");
        manager.add("MovieNameIV");
        manager.add("MovieNameV");
        String[] expected = {"MovieNameV", "MovieNameIV", "MovieNameIII"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldReverseNameHigherLimit() {
        MoviesPosterManager manager = new MoviesPosterManager(7);
        manager.add("MovieNameI");
        manager.add("MovieNameII");
        manager.add("MovieNameIII");
        manager.add("MovieNameIV");
        manager.add("MovieNameV");
        manager.add("MovieNameVI");
        String[] expected = {"MovieNameVI", "MovieNameV", "MovieNameIV", "MovieNameIII", "MovieNameII", "MovieNameI"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

}