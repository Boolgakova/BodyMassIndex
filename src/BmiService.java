public class BmiService {
    public double calculate(double weight, double height) {
        double index;
        index = weight / Math.pow((height / 100), 2);
        return index;
    }
}
