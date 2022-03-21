package studentbooksystem;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Book> bookList;
    ArrayList<String> bookList2;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        bookList = new ArrayList<Book>();
    }

    public void addBook(String name){
        Book book = new Book(name);

        bookList.add(book);
    }

    public void showStudentBookInfo(){
        System.out.print(studentName + " 학생이 읽은 책은 : ");
        for(Book book : bookList){
            System.out.print(book.getBookName() + " ");
        }
        System.out.println("입니다!");


    }


}
