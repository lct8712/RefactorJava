/**
 * @author chentian
 */
public class NewReleasePrice extends Price {
    @Override
    public int getPoint(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
