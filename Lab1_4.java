import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        System.out.println("Введите количество точек");
        int number = numb.nextInt();//ввод количества точек
        double x = 0;
        double y = 0;
        System.out.println("Введите радиус окружности");
        double rad = numb.nextInt();
        int count = 0;
        if (number < 0) {System.out.println("Введены некорректные значения");
                System.exit(0);}
        while (number != 0) {
                System.out.println("Введите значение x");
                if (numb.hasNextDouble()) {
                    x = numb.nextDouble();
                }
                System.out.println("Введите значение y");
                if (numb.hasNextDouble()) {
                    y = numb.nextDouble();
                    if( (x*x) + (y*y) <= (rad* rad)) {
                        count +=1;
                    }}
                else {System.out.println("Введены некорректные значения");
                    numb.next();}
            number -=1;}

            System.out.println("Количество точек попадающих в окружность =" + count);
            numb.close();

    }}