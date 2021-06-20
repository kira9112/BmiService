public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate (56, 1.65);
        System.out.println(index);
    }
}