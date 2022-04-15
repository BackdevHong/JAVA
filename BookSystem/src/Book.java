import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<BookClass> list = new ArrayList<>();
        Iterator<BookClass> itr = list.iterator();
        int select;

        while (true) {
            do {
                select = 0;
                System.out.println("===== 사서 시스템에 돌아오신것을 환영합니다. =====");
                System.out.print("책 추가는 1, 책 확인은 2, 종료는 3을 적고 엔터키를 입력해주세요 : ");
                select = scn.nextInt();
            }
            while (select < 1 || select > 3);

            switch (select) {
                case 1:
                    System.out.println("책 추가를 입력하셨습니다.");
                    System.out.print("희망하시는 책 이름을 적어주세요 : ");
                    String title = scn.next();
                    System.out.print("책에 평점은 몇점인가요? ( 1 ~ 5 ) : ");
                    int star = scn.nextInt();
                    System.out.println("책을 등록하고 있습니다..");
                    list.add(new BookClass(title, star));
                    System.out.println("책 등록을 완료하였습니다. 초기 화면으로 다시 넘어갑니다..");
                    break;
                case 2:
                    System.out.println("책 확인을 입력하셨습니다. 책 목록을 출력합니다.");
                    System.out.println("================================================");
                    for (BookClass e : list) {
                        System.out.println("책 이름 : " + e.title + " / 책 평점 : " + e.star);
                        System.out.println("================================================");
                    }
                case 3:
                    System.exit(0);
                default:
                    System.out.println("존재하지 않는 번호입니다. 처음으로 돌아갑니다.");
                    break;
            }
        }
    }
}
