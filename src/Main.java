public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 62; //вес в килограммах
        double height = 166; //рост в сантиметрах
        double index = service.calculate(weight, height);
        System.out.println("Ваш ИМТ составляет " + index);
    }
}