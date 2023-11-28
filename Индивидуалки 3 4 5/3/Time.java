public class Time implements Triad {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.second = second % 60;
        this.minute = (minute + second / 60) % 60;
        this.hour = (hour + (minute + second / 60) / 60) % 24;
    }

    public void plus1First() {
        hour = (hour + 1) % 24;
    }

    public void plus1Second() {
        minute = (minute + 1) % 60;
        if (minute == 0) {
            plus1First();
        }
    }

    public void plus1Third() {
        second = (second + 1) % 60;
        if (second == 0) {
            plus1Second();
        }
    }

    void print() {
        System.out.println("ЧАСЫ:МИНУТЫ:СЕКУНДЫ");
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
