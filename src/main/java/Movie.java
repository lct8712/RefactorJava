/**
 * @author chentian
 */
public class Movie {

    private String title;
    private Type priceCode;

    public enum Type {
        CHILDREN,
        REGULAR,
        NEW_RELEASE
    }

    public Movie(String title, Type priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    int getPoint(int daysRented) {
        if (getPriceCode() == Type.NEW_RELEASE && daysRented > 1)
            return 2;
        return 1;
    }

    double getCharge(int daysRented) {
        double amount = 0;
        switch (getPriceCode()) {
            case REGULAR:
                amount += 2;
                if (daysRented > 2)
                    amount += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                amount += daysRented * 3;
                break;
            case CHILDREN:
                amount += 1.5;
                if (daysRented > 3)
                    amount += (daysRented - 3) * 1.5;
                break;
        }
        return amount;
    }

    public Type getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(Type priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }
}
