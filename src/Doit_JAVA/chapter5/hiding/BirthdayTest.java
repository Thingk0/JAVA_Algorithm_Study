package Doit_JAVA.chapter5.hiding;

class Birthday {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if ( month == 2) {
            if ( day < 1 || day > 28 )
                System.out.println("날짜 오류입니다.");
        } else
            this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class BirthdayTest {
    public static void main(String[] args){

        Birthday birthday = new Birthday();

        birthday.setYear(2022);
        birthday.setMonth(2);
        birthday.setDay(30);

    }
}

