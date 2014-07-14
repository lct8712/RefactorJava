import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testEmptyStatement() throws Exception {
        Customer customer = new Customer("chentian", new ArrayList<Rental>());
        String statement = customer.statement();
        assertEquals("Rental record for chentian\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", statement);
    }

    @Test
    public void testStatement() throws Exception {
        Customer customer = new Customer("chentian", new ArrayList<Rental>());
        customer.addRental(new Rental(new Movie("children movie", Movie.Type.CHILDREN), 2));
        customer.addRental(new Rental(new Movie("release movie", Movie.Type.NEW_RELEASE), 3));
        customer.addRental(new Rental(new Movie("regular movie", Movie.Type.REGULAR), 4));
        String statement = customer.statement();
        assertEquals("Rental record for chentian\n" +
                "\tchildren movie\t1.5\n" +
                "\trelease movie\t9.0\n" +
                "\tregular movie\t5.0\n" +
                "Amount owed is 15.5\n" +
                "You earned 4 frequent renter points", statement);
    }
}