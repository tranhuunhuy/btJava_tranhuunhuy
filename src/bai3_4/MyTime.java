package bai3_4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this(0, 0, 0);
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59.");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second must be between 0 and 59.");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (++second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        if (++minute == 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        if (++hour == 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (--second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        if (--minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        if (--hour < 0) {
            hour = 23;
        }
        return this;
    }
}

