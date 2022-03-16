package datevalidcheck;

import java.util.Calendar;

public class MyDate {
    private final Calendar check = Calendar.getInstance();
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public MyDate(int year, int month, int day){
        setYear(year);
        setDay(day);
        setMonth(month);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day < 0 || day > 31){
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day < 0 || day > 30){
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 2:
                if (day < 0 || day > 28){
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > check.getActualMaximum(Calendar.MONTH)){
            isValid = false;
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate(){
        if (isValid){
            System.out.println("유효한 날짜입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}