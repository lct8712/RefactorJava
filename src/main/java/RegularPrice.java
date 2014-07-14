/**
 * @author chentian
 */
public class RegularPrice extends Price {
    @Override
    public int getPoint(int daysRented) {
        return 1;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
