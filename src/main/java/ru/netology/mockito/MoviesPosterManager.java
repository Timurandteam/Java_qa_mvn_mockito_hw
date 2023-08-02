package ru.netology.mockito;

public class MoviesPosterManager {
    private String[] movieNames = new String[0];
    private int limit;

    public MoviesPosterManager() {
        this.limit = 5;
    }

    public MoviesPosterManager(int limit) {
        this.limit = limit;
    }

    public String[] findAll() {
        return movieNames;
    }

    public void add(String movieName) {
        String[] tmp = new String[movieNames.length + 1];
        for (int i = 0; i < movieNames.length; i++) {
            tmp[i] = movieNames[i];
        }
        tmp[tmp.length - 1] = movieName;
        movieNames = tmp;
    }

    public String[] findLast() {
        int resultLength;
        if (movieNames.length < limit) {
            resultLength = movieNames.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movieNames[movieNames.length - 1 - i];
        }
        return result;
    }


}
