import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String name, quotation;
        Random ran;
        int num;
        System.out.println("Hello World!");
        name = new String("Robert Baker");
        System.out.println(name);
        quotation = "\"" + name + "\"";
        System.out.println(quotation);
        ran = new Random();
        num = ran.nextInt();
        System.out.println(num);
    }
}
