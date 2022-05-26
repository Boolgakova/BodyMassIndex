public class BmiService {
    double index;

    public double calculate(double weight, double height) {
        index = weight / Math.pow((height / 100), 2);
        return index;
    }
}
