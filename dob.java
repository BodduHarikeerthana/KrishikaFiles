import java.lang.*;
public class dob {
    private int day;
    private int month;
    private int year;

    public dob(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    Public String toString() {
        return day + "/" + month + "/" + year;
    }
    public static void main(String[] args) {
        dob dateOfBirth = new dob(15, 8, 1990);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}