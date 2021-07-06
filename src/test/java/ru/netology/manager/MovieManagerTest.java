package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    private Movie one = new Movie(1, "img1", "one", "one");
    private Movie two = new Movie(2, "img2", "two", "two");
    private Movie three = new Movie(3, "img3", "three", "three");
    private Movie four = new Movie(4, "img4", "four", "four");
    private Movie five = new Movie(5, "img5", "five", "five");
    private Movie six = new Movie(6, "img6", "six", "six");
    private Movie seven = new Movie(7, "img7", "seven", "seven");
    private Movie eight = new Movie(8, "img8", "eight", "eight");
    private Movie nine = new Movie(9, "img9", "nine", "nine");
    private Movie ten = new Movie(10, "img10", "ten", "ten");
    private Movie eleven = new Movie(11, "img11", "eleven", "eleven");

    @Test
    void shouldGetAll() {
        Movie[] expected = new Movie[]{three, two, one};

        MovieManager manager = new MovieManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        Movie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetDefMovies() {
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six, five, four, three, two, one};

        MovieManager manager = new MovieManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        Movie[] actual = manager.getSomeMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetLengthMovies() {
        Movie[] expected = new Movie[]{five, four, three, two, one};

        MovieManager manager = new MovieManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        Movie[] actual = manager.getSomeMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLessTen() {
        Movie[] expected = new Movie[]{five, four, three, two, one};

        MovieManager manager = new MovieManager(5);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        Movie[] actual = manager.getSomeMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMoreTen() {
        Movie[] expected = new Movie[]{eleven, ten, nine, eight, seven, six, five, four, three, two, one};

        MovieManager manager = new MovieManager(11);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        Movie[] actual = manager.getSomeMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMovie() {
        Movie[] expected = new Movie[]{four, three, two, one};

        MovieManager manager = new MovieManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        Movie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }
}