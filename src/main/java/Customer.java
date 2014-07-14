import java.util.ArrayList;
import java.util.List;

/**
 * @author chentian
 */
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental record for " + getName() + "\n";
        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getAmount() + "\n";
        }
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getTotalPoints() + " frequent renter points";
        return result;
    }

    private int getTotalPoints() {
        int result = 0;
        for (Rental rental : rentals) {
            result += rental.getPoint();
        }
        return result;
    }

    private double getTotalAmount() {
        double result = 0;
        for (Rental rental : rentals) {
            result += rental.getAmount();
        }
        return result;
    }
}
