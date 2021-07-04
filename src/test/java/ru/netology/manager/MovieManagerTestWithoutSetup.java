package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTestWithoutSetup {

    Movie one = new Movie(1, "img1", "one", "one");
    Movie two = new Movie(2, "img2", "two", "two");
    Movie three = new Movie(3, "img3", "three", "three");
    Movie four = new Movie(4, "img4", "four", "four");
    Movie five = new Movie(5, "img5", "five", "five");
    Movie six = new Movie(6, "img6", "six", "six");
    Movie seven = new Movie(7, "img7", "seven", "seven");
    Movie eight = new Movie(8, "img8", "eight", "eight");
    Movie nine = new Movie(9, "img9", "nine", "nine");
    Movie ten = new Movie(10, "img10", "ten", "ten");
    Movie eleven = new Movie(11, "img11", "eleven", "eleven");

    @Test
    public void shouldGetTenMovies() {
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


}