package ru.netology.manager;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@NoArgsConstructor
@Data

public class MovieManager {

    private int moviesToGet = 10;
    private Movie[] movies = new Movie[0];

    public MovieManager(int moviesToGet) {
        this.moviesToGet = moviesToGet;
    }

    public Movie[] getAll() {
        Movie[] result = new Movie[movies.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Movie[] getSomeMovies() {
        int resultLength;
        if (movies.length >= moviesToGet) {
            resultLength = moviesToGet;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public void add(Movie movie) {
        // создаём новый массив размером на единицу больше
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        // копируем поэлементно
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }


}