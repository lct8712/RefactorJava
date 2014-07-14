/**
 * @author chentian
 */
public abstract class Price {
    abstract double getCharge(int daysRented);

    abstract int getPoint(int daysRented);

    public static Price createPrice(Movie.Type movieType) {
        switch (movieType) {
            case CHILDREN:
                return new ChildrenPrice();
            case REGULAR:
                return new RegularPrice();
            case NEW_RELEASE:
                return new NewReleasePrice();
            default:
                throw new IllegalArgumentException("type not supported");
        }
    }
}
