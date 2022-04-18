
import java.util.Scanner;



public class ProgRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Давайте определим, являются ли три целых положительных числа сторонами треугольника и какой его тип");
        System.out.println("Введите первое положительное число");
        int a = scanner.nextInt();
        System.out.println("Введите второе положительное число");
        int b = scanner.nextInt();
        System.out.println("Введите третье положительное число");
        int c = scanner.nextInt();

        Triangle triangle = new Triangle ();
        System.out.println(triangle.triangleType(a, b, c));



    }
}
