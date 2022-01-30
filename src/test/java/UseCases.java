import calculations.Calculation;
import calculations.ExpenseCalculation;
import events.Event;
import events.EventDate;
import events.Expense;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class UseCases {

    // Events I want to keep track off like transactions, deprecation, property purchases, dependents added/removed,
    // basically anything a business or individual tracks for financial or planning reason
    Set<Event> events = new HashSet<>();

    // Things I want to calculate about the events that have occurred
    Set<Calculation> calculations = new HashSet<>();

    @Before
    public void init(){
        Event expense = new Expense(new EventDate(2020), 25.0, "Advertising","Efficient Software LLC");
        Event expense2 = new Expense(new EventDate(2020), 25.0, "Vehicle","Efficient Software LLC");
        Event expense3 = new Expense(new EventDate(2020), 50.0, "Advertising","Efficient Software LLC");

        events.add(expense);
        events.add(expense2);
        events.add(expense3);
    }

    // In this test, I want to look at all my events and calulate advertising expense for efficient software in 2020
    @Test
    public void advertisingExpenseUseCase() {
        Calculation advertisingExpenseFor2020 = new ExpenseCalculation("Efficient Software LLC", 2020, "Advertising");
        Double result = advertisingExpenseFor2020.calculate(events);
        Double expected = 75.0;

        Assert.assertEquals(expected, result, 0.0);
    }



}
