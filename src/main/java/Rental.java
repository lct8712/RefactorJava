/**
 * @author chentian
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    double getAmount() {
        return movie.getCharge(this.getDaysRented());
    }

    int getPoint() {
        // add bonus for a two day new release rental
        return movie.getPoint(this.getDaysRented());
    }

}
