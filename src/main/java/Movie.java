/**
 * @author chentian
 */
public class Movie {

    private String title;
    private Price priceCode;

    public enum Type {
        CHILDREN,
        REGULAR,
        NEW_RELEASE
    }

    public Movie(String title, Type movieType) {
        this.title = title;
        setPriceCode(movieType);
    }

    public void setPriceCode(Type movieType) {
        priceCode = Price.createPrice(movieType);
    }

    double getCharge(int daysRented) { return priceCode.getCharge(daysRented); }

    int getPoint(int daysRented) { return priceCode.getPoint(daysRented); }

    public String getTitle() { return title; }
}
