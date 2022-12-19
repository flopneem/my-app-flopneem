package spacex;

import java.time.Month;

public class Date {

    private int day;
    private Month month;
    private int year;

    public Date() {
        // Default constructor
    }

    public Date(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, spacex.Month month, int year) {

    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public Month getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(Month month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return year + "-" + (month == null ? "" : month.toString()) + "-" + day;
    }

}



