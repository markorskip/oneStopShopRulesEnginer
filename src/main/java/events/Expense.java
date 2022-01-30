package events;


import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

public class Expense extends Event {

    private final Double amount;
    private final String category;
    private final String relatesTo;

    public Expense(EventDate eventDate, Double amount, String category, String relatesTo) {
        super(eventDate);
        this.amount = amount;
        this.category = category;
        this.relatesTo = relatesTo;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getRelatesTo() {
        return relatesTo;
    }

    public static Set<Expense> filterExpenses(Set<Event> events) {
        return events.stream().filter(event -> event instanceof Expense).map(event -> (Expense) event).collect(Collectors.toSet());
    }

}
