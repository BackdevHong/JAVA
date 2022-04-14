package movie;

//import java.util.Scanner;

public class MovieArrayClass {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Movie[] list = new Movie[10];

        list[0] = new Movie("아이언맨", "John");
        list[1] = new Movie("테스트영화", "감독");
        list[2] = new Movie("겨울왕국", "크리스 벅");

        for(int i = 0; i < Movie.count; i++){
            System.out.println(list[i].title);
            System.out.println("=============");
            System.out.println(list[i].dir);
        }

    }
}
