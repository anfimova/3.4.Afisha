package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTestWithSetup {

    private MovieManager manager = new MovieManager();

    private Movie one = new Movie(1, "img1", "one", "one");
    private Movie two = new Movie(2, "img2", "two", "two");
    private Movie three = new Movie(3, "img3", "three", "three");
    private Movie four = new Movie(4, "img4", "four", "four");

    @BeforeEach
    public void setUp() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
    }

    @Test
    public void shouldGetAllMovies() {
        Movie[] expected = new Movie[]{three, two, one};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        Movie[] expected = new Movie[]{four, three, two, one};
        manager.add(four);
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

}