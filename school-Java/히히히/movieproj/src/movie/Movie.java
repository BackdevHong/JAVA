package movie;

import java.util.Scanner;

public class Movie {
    String title, dir;
    static int count;

    public Movie(String title, String dir) {
        this.title = title;
        this.dir = dir;
        count++;
    }
}
