
import java.util.* ;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        double a,b,result;

        while (true) {

            System.out.println("Выберите нужное действие: ");
            System.out.println("1.Сложение");
            System.out.println("2.Вычитание");
            System.out.println("3.Умножение");
            System.out.println("4.Деление");
            System.out.println("5.Выход");

            int operator = scan.nextInt();

            System.out.println("Введите первое число: ");
            a = scan.nextDouble();

            System.out.println("Введите второе число: ");
            b = scan.nextDouble();

            Functions function = new Functions();

            switch (operator) {
                case 1:
                    result = function.addition(a,b);
                    System.out.println(a + " + " + b + " = " + result);
                    break;
                case 2:
                    result = a - b ;
                    System.out.println(a + " - " + b + " = " + result);
                    break;
                case 3:
                    result = a * b ;
                    System.out.println(a + " * " + b + " = " + result);
                    break;
                case 4:
                    result = a / b ;
                    System.out.println(a + " / " + b + " = " + result);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Неверный выбор!");
                    break;

            }
        }
    }
}
