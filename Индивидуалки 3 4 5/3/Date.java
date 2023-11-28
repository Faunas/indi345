import java.time.LocalDate;

public class Date implements Triad {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        adjustDate();
    }

    private void adjustDate() {
        if (month > 12) {
            int yearsToAdd = (month - 1) / 12;
            year += yearsToAdd;
            month = (month - 1) % 12 + 1;
        }

        try {
            LocalDate.of(year, month, day);
        } catch (Exception e) {
            LocalDate adjustedDate = LocalDate.of(year, month, 1).plusDays(day - 1);
            day = adjustedDate.getDayOfMonth();
            month = adjustedDate.getMonthValue();
            year = adjustedDate.getYear();
        }
    }

    public void plus1First() {
        day += 1;
        adjustDate();
    }

    public void plus1Second() {
        month += 1;
        adjustDate();
    }

    public void plus1Third() {
        year += 1;
        adjustDate();
    }

    void print() {
        System.out.println("ДЕНЬ:МЕСЯЦ:ГОД");
        System.out.println(day + "." + month + "." + year);
    }
}
