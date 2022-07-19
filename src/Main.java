public class Main {
    public static void main(String[] args){
        BmiService service= new BmiService();
        double height= 1.90;
        double weight= 90;
        double bmi= BmiService.calculate(height, weight);
        System.out.printf("ИМТ равен: %.2f", bmi);
    }
}
