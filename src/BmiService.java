public class BmiService {
    public static double calculate(double height, double weigth) {
        double bmi = weigth / (height * height);
        return bmi;
    }
}
