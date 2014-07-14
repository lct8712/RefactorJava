/**
 * @author chentian
 */
public class ChildrenPrice extends Price {
    @Override
    public int getPoint(int daysRented) {
        return 1;
    }

    @Override
    double getCharge(int daysRented) {
        return (daysRented > 3) ? (daysRented - 3) * 1.5 : 1.5;
    }
}
