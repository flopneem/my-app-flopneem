package spacex;
import java.util.Objects;

public class Time {
    private int hour;
    private int minutes;

    public   Time(int hour,int minutes) {
        this.hour=hour;
        this.minutes = minutes;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Time load = (Time) o;
        return Objects.equals(hour, load.hour)
                && Objects.equals(this.minutes, load.minutes);

    }

    @Override
    public String toString() {
        return  hour +":"
                + minutes;
    }

}




