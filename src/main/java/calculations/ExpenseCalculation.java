package calculations;

import events.Event;
import events.Expense;

import java.util.Set;

public class ExpenseCalculation implements Calculation{

    private String businessName;
    private int year;
    private String expenseCategory;

    public ExpenseCalculation(String businessName, int year, String expenseCategory) {
        this.businessName = businessName;
        this.year = year;
        this.expenseCategory = expenseCategory;
    }

    @Override
    public Double calculate(Set<Event> events) {
        Double result = 0.0;

        for (Expense expense: Expense.filterExpenses(events)) {
            if (expense.getCategory().equals(expenseCategory) && expense.getEventDate().getYear() == this.year && expense.getRelatesTo().equals(this.businessName)) {
                result += expense.getAmount();
            }
        }
        System.out.println("Advertising Expenses for " + businessName + " in year " + year + " are " + result);
        return result;
    }
}
