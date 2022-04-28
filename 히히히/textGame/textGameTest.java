import com.sun.tools.javac.Main;

import java.util.Scanner;


abstract class Sprite{
    int x = 3, y = 3;
    abstract void move(char c);
}

class Mine extends Sprite{
    void move(char c){
        if(c == 'h') --x;
        else if(c == 'j') --y;
        else if(c == 'k') ++y;
        else if(c == 'l') ++x;
    }
}

class Gold extends Sprite{
    public Gold(){
        x = 3;
        y = 6;
    }
    void move(char c){}
}

class Monster extends Sprite{
    public Monster(){
        x=7;
        y=7;
    }
    void move(char c){
        x+=(Math.random()-0.5>0?1:-1);
        y+=(Math.random()-0.5>0?1:-1);
    }

}


public class textGameTest {
    public static void main(String[] args) {
        char[][] map = {
                { '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#' },
                { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
                { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
                { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
                { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
                { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
                { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
                { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
                { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
                { '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#' },
        };
        Scanner sc = new Scanner(System.in);

        Mine mine = new Mine();
        Monster mon = new Monster();
        Gold gold = new Gold();

        while (true){
            for(int y = 0; y < map.length; y++){
                for(int x = 0; x < map[y].length; x++ ){
                    if(y == mon.y && x == mon.x){
                        System.out.println("M");
                    } else if (y == mine.y && x == mine.x){
                        System.out.println("@");
                    } else if (y == gold.x && x == gold.x) {
                        System.out.println("G");
                    } else {
                        System.out.println(map[y][x]);
                    }
                }
            }

            System.out.print("원하는걸 입력하라 시발아");
            char a = sc.next().charAt(9);
            mine.move(a);
            mon.move(a);
        }
    }
}