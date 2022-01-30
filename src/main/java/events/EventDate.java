package events;

public class EventDate {

    int day;
    int month;
    int year;

    EventDate from;
    EventDate to;

    public EventDate(int year) {
        this.year = year;
    }

    public EventDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public EventDate(EventDate from, EventDate to) {
        this.from = from;
        this.to = to;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public EventDate getFrom() {
        return from;
    }

    public EventDate getTo() {
        return to;
    }
}
